package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.Division;
import com.example.casestudy.model.Employee_model.EducationDegree;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IDivisionService {
    List<Division> findAll();
}
