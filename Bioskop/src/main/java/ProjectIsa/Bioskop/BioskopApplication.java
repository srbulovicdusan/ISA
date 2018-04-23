package ProjectIsa.Bioskop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import controller.ThematicItemController;
import repository.ThematicItemRepository;
import service.ThematicItemService;


@SpringBootApplication
@ComponentScan(basePackageClasses = ThematicItemController.class)
@ComponentScan(basePackageClasses = ThematicItemService.class)
@ComponentScan(basePackageClasses = ThematicItemRepository.class)
public class BioskopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BioskopApplication.class, args);
	}
}
