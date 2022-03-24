package com.example.casestudy.service.Employee;

import com.example.casestudy.model.Employee_model.EducationDegree;
import com.example.casestudy.model.Employee_model.Position;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IPositionService {
    List<Position> findAll();
}
