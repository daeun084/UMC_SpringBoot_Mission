package Umc.UMC_SpringBoot_Mission.study.domain;

import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ReviewImage {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewImageId;
    private Text imageUrl;
    //리뷰id
    //생성날짜
    //갱신날짜
}
