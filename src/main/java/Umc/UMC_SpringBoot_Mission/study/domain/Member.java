package Umc.UMC_SpringBoot_Mission.study.domain;

import Umc.UMC_SpringBoot_Mission.study.domain.enums.Gender;
import Umc.UMC_SpringBoot_Mission.study.domain.enums.LoginType;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder //Builder pattern을 사용하기 위함
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member {
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

}
