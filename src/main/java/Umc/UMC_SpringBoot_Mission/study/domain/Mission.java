package Umc.UMC_SpringBoot_Mission.study.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long missionId;
    private String content;
    private Long point; //reward
    private Long confirmNum; //사장님 인증번호
    private LocalDate deadline; //마감날짜
    //생성날짜
    //갱신날짜
    //가게id
    //지역id


}
