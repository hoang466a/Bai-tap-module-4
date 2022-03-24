package com.example.casestudy.repository.Employee;

import com.example.casestudy.model.Employee_model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
