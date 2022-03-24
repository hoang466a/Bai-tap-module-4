package com.example.casestudy.repository.Employee;

import com.example.casestudy.model.Employee_model.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {
}
