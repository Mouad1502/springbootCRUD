package net.backend.springboot;

import net.backend.springboot.model.Student;
import net.backend.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setFirstName("Mouad");
		student.setLastName("Abbar");
		student.setEmail("mrmouadabbar@gmail.com");
		studentRepository.save(student);

		Student student1 = new Student();
		student1.setFirstName("Ayoub");
		student1.setLastName("Elharem");
		student1.setEmail("ayoubelharem@gmail.com");
		studentRepository.save(student1);

	}
}
