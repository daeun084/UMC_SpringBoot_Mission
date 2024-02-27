package Umc.UMC_SpringBoot_Mission.study.web.dto;

import lombok.Getter;

import java.util.List;

public class MemberRequestDTO {
    @Getter
    public static class JoinDto{
        String name;
        Integer gender;
        String birth; //회원생일
        String address; //주소
        List<Long> preferCategory;



    }
}
