package net.example.springboot;

import net.example.springboot.model.Employee;
import net.example.springboot.repository.EmployeeRepository;
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
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee();
		employee1.setFirstName("John");
		employee1.setLastName("Wick");
		employee1.setEmailId("johnwick@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Peter");
		employee2.setLastName("Parker");
		employee2.setEmailId("peterparker@gmail.com");
		employeeRepository.save(employee2);
	}
}

