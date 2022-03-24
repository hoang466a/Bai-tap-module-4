package com.example.casestudy.repository.Employee;

import com.example.casestudy.model.Employee_model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
}
