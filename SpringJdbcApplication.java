package xorstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan({ "xorstack" })
@Configuration
public class SpringJdbcApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

}
