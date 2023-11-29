package Umc.UMC_SpringBoot_Mission.study.web.controller;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.ApiResponse;
import Umc.UMC_SpringBoot_Mission.study.converter.MemberConverter;
import Umc.UMC_SpringBoot_Mission.study.domain.Member;
import Umc.UMC_SpringBoot_Mission.study.service.MemberService.MemberCommandService;
import Umc.UMC_SpringBoot_Mission.study.web.dto.MemberRequestDTO;
import Umc.UMC_SpringBoot_Mission.study.web.dto.MemberResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {
    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDto request){
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }
}
