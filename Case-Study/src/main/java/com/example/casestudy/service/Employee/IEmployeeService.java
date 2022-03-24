package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);
    Employee findById(Integer id);
    void save(Employee employee);
    Page<Employee> employeeSearchByName(String name, Pageable pageable);
    void deleteById(Integer id);
}
