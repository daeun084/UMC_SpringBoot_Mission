package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.status;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.BaseCode;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.ReasonDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {
    ;

    @Override
    public ReasonDto getReason() {
        return null;
    }

    @Override
    public ReasonDto getReasonHttpStatus() {
        return null;
    }
}
