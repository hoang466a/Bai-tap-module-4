package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.EducationDegree;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> findAll();
}
