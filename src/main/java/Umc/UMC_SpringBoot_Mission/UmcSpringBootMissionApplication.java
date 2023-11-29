package Umc.UMC_SpringBoot_Mission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UmcSpringBootMissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmcSpringBootMissionApplication.class, args);
	}

}
