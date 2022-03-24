package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.EducationDegree;
import org.springframework.data.domain.Page;

public interface IEducationDegreeService {
    Page<EducationDegree>findAll();
}
