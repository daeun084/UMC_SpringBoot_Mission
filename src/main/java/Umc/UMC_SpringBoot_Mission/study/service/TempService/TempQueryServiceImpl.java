package Umc.UMC_SpringBoot_Mission.study.service.TempService;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.exception.handler.TempHandler;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.status.ErrorStatus;
public class TempQueryServiceImpl implements TempQueryService{
    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1) //?? 2아님?
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
    //에러 조건에 부합하면 에러 생성
}
