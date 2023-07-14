package net.example.springboot.repository;

import net.example.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // All CRUD database methods.
}
