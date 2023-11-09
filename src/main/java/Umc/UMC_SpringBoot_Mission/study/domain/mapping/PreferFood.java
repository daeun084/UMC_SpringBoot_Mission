package Umc.UMC_SpringBoot_Mission.study.domain.mapping;

import Umc.UMC_SpringBoot_Mission.study.domain.FoodCategory;
import Umc.UMC_SpringBoot_Mission.study.domain.Member;
import Umc.UMC_SpringBoot_Mission.study.domain.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PreferFood extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long preferFoodId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_category_id")
    private FoodCategory foodCategory;
}
