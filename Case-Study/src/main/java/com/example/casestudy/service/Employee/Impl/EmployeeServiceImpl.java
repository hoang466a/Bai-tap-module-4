package com.example.casestudy.service.Employee.Impl;

import com.example.casestudy.model.Employee_model.Employee;
import com.example.casestudy.repository.Employee.IEmployeeRepository;
import com.example.casestudy.service.Employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;


    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    @Override
    public Employee findById(Integer id) {
        return iEmployeeRepository.findById(id).orElse(null);
    }



    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public Page<Employee> employeeSearchByName(String employeeName, Pageable pageable) {
        return iEmployeeRepository.findByEmployeeNameContaining(employeeName,pageable);
    }

    @Override
    public void deleteById(Integer id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findByEmployeeId(Integer id, Pageable pageable) {
        return iEmployeeRepository.findByEmployeeId(id,pageable);
    }
}
