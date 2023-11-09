package Umc.UMC_SpringBoot_Mission.study.domain;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends Serializers.Base {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodCategoryId;
    private String foodName;
    
}
