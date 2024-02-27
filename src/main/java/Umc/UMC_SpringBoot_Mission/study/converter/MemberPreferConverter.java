package Umc.UMC_SpringBoot_Mission.study.converter;

import Umc.UMC_SpringBoot_Mission.study.domain.FoodCategory;
import Umc.UMC_SpringBoot_Mission.study.domain.mapping.PreferFood;

import java.util.List;
import java.util.stream.Collectors;

public class MemberPreferConverter {
    public static List<PreferFood> toMemberPreferList(List<FoodCategory> foodCategoryList){

        return foodCategoryList.stream()
                .map(foodCategory ->
                        PreferFood.builder()
                                .foodCategory(foodCategory)
                                .build()
                ).collect(Collectors.toList());
    }
}
