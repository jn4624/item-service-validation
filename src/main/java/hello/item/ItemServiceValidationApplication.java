package hello.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceValidationApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceValidationApplication.class, args);
	}

	/**
	 * implements WebMvcConfigurer
	 * 글로벌 설정 - 모든 컨트롤러에 모두 적용
	 */
//	@Override
//	public Validator getValidator() {
//		return new ItemValidator();
//	}
}
