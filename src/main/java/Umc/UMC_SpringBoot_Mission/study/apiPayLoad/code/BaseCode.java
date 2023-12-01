package Umc.UMC_SpringBoot_Mission.study.apiPayLoad.code;
public interface BaseCode {
    //Status package의 클래스들이 해당 인터페이스를 implement해 아래 메소드들을 구체화
    public ReasonDTO getReason();
    public ReasonDTO getReasonHttpStatus();
}
