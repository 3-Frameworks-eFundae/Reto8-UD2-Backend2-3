package frameworks.backend2.ud2.reto8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Reto8Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto8Application.class, args);
	}

}
