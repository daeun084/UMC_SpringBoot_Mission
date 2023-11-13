package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.status;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.BaseErrorCode;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.ErrorReasonDTO;
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

    //BaseErrorCode의 메소드 오버라이딩
    @Override
    public ErrorReasonDTO getReason() {
        return ErrorReasonDTO.builder()
                .code(code)
                .message(message)
                .isSuccess(false)
                .build();
    }

    @Override
    public ErrorReasonDTO getReasonHttpStatus() {
        return ErrorReasonDTO.builder()
                .code(code)
                .message(message)
                .isSuccess(false)
                .httpStatus(httpStatus)
                .build();
    }
}
