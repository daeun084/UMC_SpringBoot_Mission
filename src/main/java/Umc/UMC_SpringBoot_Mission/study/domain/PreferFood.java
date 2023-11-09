package Umc.UMC_SpringBoot_Mission.study.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PreferFood {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferFoodId;
    //회원id
    //음식카테고리id
    //생성날짜
    //갱신날짜
}
