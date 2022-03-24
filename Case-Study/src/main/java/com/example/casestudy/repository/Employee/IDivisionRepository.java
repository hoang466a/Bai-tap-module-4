package com.example.casestudy.repository.Employee;

import com.example.casestudy.model.Employee_model.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division,Integer> {

}
