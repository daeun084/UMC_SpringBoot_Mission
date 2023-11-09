package Umc.UMC_SpringBoot_Mission.study.domain.mapping;

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
    private MissionStatus missionStatus;
    //회원id
    //미션id

}
