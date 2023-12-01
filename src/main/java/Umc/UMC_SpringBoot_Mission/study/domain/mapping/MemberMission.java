package Umc.UMC_SpringBoot_Mission.study.domain.mapping;

import Umc.UMC_SpringBoot_Mission.study.domain.Member;
import Umc.UMC_SpringBoot_Mission.study.domain.Mission;
import Umc.UMC_SpringBoot_Mission.study.domain.common.BaseEntity;
import Umc.UMC_SpringBoot_Mission.study.domain.enums.MissionStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userMissionId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MissionStatus missionStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

}
