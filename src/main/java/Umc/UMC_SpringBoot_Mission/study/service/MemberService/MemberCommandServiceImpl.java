package Umc.UMC_SpringBoot_Mission.study.service.MemberService;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.status.ErrorStatus;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.exception.handler.FoodCategoryHandler;
import Umc.UMC_SpringBoot_Mission.study.converter.MemberPreferConverter;
import Umc.UMC_SpringBoot_Mission.study.domain.FoodCategory;
import Umc.UMC_SpringBoot_Mission.study.domain.Member;
import Umc.UMC_SpringBoot_Mission.study.domain.enums.Gender;
import Umc.UMC_SpringBoot_Mission.study.domain.mapping.PreferFood;
import Umc.UMC_SpringBoot_Mission.study.repository.FoodCategoryRepository;
import Umc.UMC_SpringBoot_Mission.study.repository.MemberRepository;
import Umc.UMC_SpringBoot_Mission.study.web.dto.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberCommandServiceImpl implements MemberCommandService{
    private final MemberRepository memberRepository;
    private final FoodCategoryRepository foodCategoryRepository;


    @Override
    public Member joinMember(MemberRequestDTO.JoinDto request) {
        Member newMember = toMember(request);
        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());
        List<PreferFood> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);
        memberPreferList.forEach(
                preferFood -> {preferFood.setMember(newMember);}
        );
        return memberRepository.save(newMember);
    }

    public static Member toMember(MemberRequestDTO.JoinDto request){
        Gender gender = null;
        switch (request.getGender()){
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            case 3:
                gender = Gender.NONE;
                break;
        }
        return Member.builder()
                .address(request.getAddress())
                .gender(gender)
                .name(request.getName())
                .preferFoodList(new ArrayList<>())
                .build();
    }
}
