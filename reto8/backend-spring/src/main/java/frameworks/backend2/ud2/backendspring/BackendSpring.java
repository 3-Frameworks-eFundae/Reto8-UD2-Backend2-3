package frameworks.backend2.ud2.backendspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BackendSpring {

	public static void main(String[] args) {
		SpringApplication.run(BackendSpring.class, args);
	}

}
