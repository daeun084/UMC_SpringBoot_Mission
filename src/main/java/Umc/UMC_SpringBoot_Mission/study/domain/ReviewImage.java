package Umc.UMC_SpringBoot_Mission.study.domain;

import Umc.UMC_SpringBoot_Mission.study.domain.common.BaseEntity;
import lombok.*;
import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ReviewImage extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewImageId;

    @Column(nullable = false)
    private Text imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private ReviewImage reviewImage;
}
