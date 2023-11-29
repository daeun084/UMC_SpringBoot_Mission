package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.exception.handler;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code.status.ErrorStatus;
import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(ErrorStatus errorStatus) {
        super(errorStatus);
    }
}
