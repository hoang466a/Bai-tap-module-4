package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.Division;
import com.example.casestudy.model.Employee_model.EducationDegree;
import org.springframework.data.domain.Page;

public interface IDivisionService {
    Page<Division> findAll();
}
