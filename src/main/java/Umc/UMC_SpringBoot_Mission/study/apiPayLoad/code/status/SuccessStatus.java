package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.status;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.BaseCode;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.ErrorReasonDTO;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.ReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {
    //일반적인 응답
    _OK(HttpStatus.OK, "OK", "OK")
    ;

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    //BaseCode의 메소드 오버라이딩
    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder()
                .code(code)
                .message(message)
                .isSuccess(true)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder()
                .code(code)
                .message(message)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build();
    }
}
