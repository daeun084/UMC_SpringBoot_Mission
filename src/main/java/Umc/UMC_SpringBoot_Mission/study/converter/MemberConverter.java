package Umc.UMC_SpringBoot_Mission.study.converter;

import Umc.UMC_SpringBoot_Mission.study.domain.Member;
import Umc.UMC_SpringBoot_Mission.study.web.dto.MemberResponseDTO;

import java.time.LocalDateTime;

public class MemberConverter {
    public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member) {
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getMemberId())
                .createdAt(LocalDateTime.now())
                .build();
    }

}
