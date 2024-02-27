package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ReasonDTO {
    //DTO이므로 Builder 추가
    private  Boolean isSuccess;
    private String code;
    private String message;
    private HttpStatus httpStatus;

}
