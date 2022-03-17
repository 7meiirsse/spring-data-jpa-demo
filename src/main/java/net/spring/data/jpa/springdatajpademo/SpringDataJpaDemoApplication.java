package net.spring.data.jpa.springdatajpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
            Student berik = new Student(
					"Berik",
					"Kusherbaev",
					"berik34.@learnjava.edu",
					21
			);
			studentRepository.save(berik);
		};
	}
}
