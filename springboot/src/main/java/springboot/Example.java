package springboot;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home(HttpServletRequest request) {


		return "HELLO WORD!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}
