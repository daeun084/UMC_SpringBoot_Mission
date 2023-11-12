package Umc.UMC_SpringBoot_Mission.study.web.controller;

import Umc.UMC_SpringBoot_Mission.study.apiPayLoad.ApiResponse;
import Umc.UMC_SpringBoot_Mission.study.converter.TempConverter;
import Umc.UMC_SpringBoot_Mission.study.web.dto.TempResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {
    @GetMapping("/test")
    public ApiResponse<TempResponse.TempTestDTO> testAPI(){

        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
    }
}
