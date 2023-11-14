package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.exception;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.BaseErrorCode;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.ErrorReasonDTO;

public class GeneralException extends RuntimeException{
    private BaseErrorCode code;
    public ErrorReasonDTO getErrorReason() {
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
