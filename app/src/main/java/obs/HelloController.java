package obs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Authorship Lynden Jay Evans
 * @Copyright Lynden Jay Evans
 * @FOSS Lynden Jay Evans
 * @Patent Lynden Jay Evans
 */
@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
