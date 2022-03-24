package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.EducationDegree;
import com.example.casestudy.model.Employee_model.Position;
import org.springframework.data.domain.Page;

public interface IPositionService {
    Page<Position> findAll();
}
