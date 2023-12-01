package Umc.UMC_SpringBoot_Mission.study.web.controller;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.ApiResponse;
import Umc.UMC_SpringBoot_Mission.study.converter.TempConverter;
import Umc.UMC_SpringBoot_Mission.study.service.TempService.TempQueryService;
import Umc.UMC_SpringBoot_Mission.study.web.dto.TempResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {
    private final TempQueryService tempQueryService;

    @GetMapping("/test")
    public ApiResponse<TempResponse.TempTestDTO> testAPI(){

        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
    }

    @GetMapping("/exception")
    public ApiResponse<TempResponse.TempExceptionDTO> exceptionAPI(@RequestParam Integer flag){
        tempQueryService.CheckFlag(flag);
        return ApiResponse.onSuccess(TempConverter.toTempExceptionDTO(flag));
        //쿼리 스트링으로 flag를 받은 다음 2면 Exception 발생
        //Exception 안터지면 onSuccess 함수 호출
    }
}
