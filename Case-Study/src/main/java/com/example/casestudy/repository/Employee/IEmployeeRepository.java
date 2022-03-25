package com.example.casestudy.repository.Employee;

import com.example.casestudy.model.Employee_model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findByEmployeeNameContaining(String employeeName, Pageable pageable);
    Page<Employee> findByEmployeeId(Integer id, Pageable pageable);
}
