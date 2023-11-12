package Umc.UMC_SpringBoot_Mission.study.converter;
import Umc.UMC_SpringBoot_Mission.study.web.dto.TempResponse;

public class TempConverter {
    public static TempResponse.TempTestDTO toTempTestDTO(){
        return TempResponse.TempTestDTO.builder()
                .testString("This is Test!")
                .build();
    }
}
