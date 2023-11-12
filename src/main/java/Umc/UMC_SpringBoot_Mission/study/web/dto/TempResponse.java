package Umc.UMC_SpringBoot_Mission.study.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class TempResponse {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TempTestDTO{
        String testString;
    }
    //Dto 자체는 수많은 곳에서 사용될 수 있음
    //static 클래스로 만들어 범용적으로 Dto 사용이 가능하게 함
}
