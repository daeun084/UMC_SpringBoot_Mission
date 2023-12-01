package Umc.UMC_SpringBoot_Mission.study.domain;

import Umc.UMC_SpringBoot_Mission.study.domain.mapping.PreferFood;
import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends Serializers.Base {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodCategoryId;

    @Column(nullable = false)
    private String foodName;

    //PreferFood 양방향 연관관계
    @OneToMany(mappedBy = "foodCategory", cascade = CascadeType.ALL)
    private List<PreferFood> preferFoodList = new ArrayList<>();
    
}
