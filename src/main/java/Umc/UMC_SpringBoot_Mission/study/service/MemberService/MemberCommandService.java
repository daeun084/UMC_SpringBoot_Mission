package Umc.UMC_SpringBoot_Mission.study.service.MemberService;

import Umc.UMC_SpringBoot_Mission.study.domain.Member;
import Umc.UMC_SpringBoot_Mission.study.web.dto.MemberRequestDTO;

import java.security.PublicKey;

public interface MemberCommandService {
    public Member joinMember(MemberRequestDTO.JoinDto request);
}
