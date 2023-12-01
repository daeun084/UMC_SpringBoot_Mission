package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.exception.handler;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.BaseErrorCode;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
        //errorCode를 GeneralException 클래스로 전달
    }
}
