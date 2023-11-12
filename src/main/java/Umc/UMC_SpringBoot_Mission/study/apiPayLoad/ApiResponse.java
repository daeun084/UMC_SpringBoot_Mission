package Umc.UMC_SpringBoot_Mission.study.apiPayLoad;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "code", "message", "result"})
public class ApiResponse<T> {
    //통일된 Api 응답을 위한 클래스
    //4가지의 response field 소유

    @JsonProperty("isSuccess") //Json으로 변환
    private final Boolean isSuccess;
    private final String code; //세부적인 응답 상황
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;
    //클라이언트에게 필요한 정보가 담김
    //어떤 형태가 들어올지 모르기 때문에 generic 타입 지정

    //성공시 응답
//    public static <T>ApiResponse<T> onSuccess(T result){
//        return new ApiResponse<>(true, SuccessStatus._OK.getCode() , SuccessStatus._OK.getMessage(), result);
//    }
//
//    public static <T> ApiResponse<T> of(BaseCode code, T result){
//        return new ApiResponse<>(true, code.getReasonHttpStatus().getCode() , code.getReasonHttpStatus().getMessage(), result);
//    }


    //실패시 응답
    public static <T>ApiResponse<T> onFailure(String code, String message, T result){
        return new ApiResponse<>(true, code, message, result);
    }

}
