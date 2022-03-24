package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.EducationDegree;
import com.example.casestudy.model.Employee_model.User;
import org.springframework.data.domain.Page;

public interface IUserService {
    Page<User> findAll();
}
