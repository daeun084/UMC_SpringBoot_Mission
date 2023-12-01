package Umc.UMC_SpringBoot_Mission.study.repository;

import Umc.UMC_SpringBoot_Mission.study.domain.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {

}
