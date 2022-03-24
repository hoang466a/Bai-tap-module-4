package com.example.casestudy.repository.Employee;

import com.example.casestudy.model.Employee_model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPositionRepository extends JpaRepository<Position,Integer> {
}
