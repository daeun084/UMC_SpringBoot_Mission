package Umc.UMC_SpringBoot_Mission.study.domain;

import Umc.UMC_SpringBoot_Mission.study.domain.common.BaseEntity;
import Umc.UMC_SpringBoot_Mission.study.domain.enums.Gender;
import Umc.UMC_SpringBoot_Mission.study.domain.enums.LoginType;
import Umc.UMC_SpringBoot_Mission.study.domain.mapping.MemberMission;
import Umc.UMC_SpringBoot_Mission.study.domain.mapping.PreferFood;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder //Builder pattern을 사용하기 위함
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //통신하는 db에 따름
    private Long memberId;
    private String name;
    private String userPassword;
    private String birth;
    private String address;
    private Long point;

    @Enumerated(EnumType.STRING) //enum을 Entity에 적용
    private LoginType loginType;
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String phoneNum;

    //PreferFood 양방향 연관관계
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<PreferFood> preferFoodList = new ArrayList<>();

    //MemberMission 양방향 연관관계
    @OneToMany(mappedBy = "member")
    private List<MemberMission> memberMissionList = new ArrayList<>();

    //Review 양방향 연관관계
    @OneToMany(mappedBy = "member")
    private List<Review> reviewList = new ArrayList<>();

}
