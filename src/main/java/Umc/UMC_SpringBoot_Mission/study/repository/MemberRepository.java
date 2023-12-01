package Umc.UMC_SpringBoot_Mission.study.repository;

import Umc.UMC_SpringBoot_Mission.study.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
