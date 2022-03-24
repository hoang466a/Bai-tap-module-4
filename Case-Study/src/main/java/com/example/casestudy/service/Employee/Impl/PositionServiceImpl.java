package com.example.casestudy.service.Employee.Impl;

import com.example.casestudy.model.Employee_model.Position;
import com.example.casestudy.repository.Employee.IPositionRepository;
import com.example.casestudy.service.Employee.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    private IPositionRepository iPositionRepository;

    @Override
    public List<Position> findAll() {
        return iPositionRepository.findAll();
    }
}
