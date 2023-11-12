package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.status;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.BaseErrorCode;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.ErrorReasonDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorStatus implements BaseErrorCode {
    ;

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ErrorReasonDto getReason() {
        return null;
    }

    @Override
    public ErrorReasonDto getReasonHttpStatus() {
        return null;
    }
}
