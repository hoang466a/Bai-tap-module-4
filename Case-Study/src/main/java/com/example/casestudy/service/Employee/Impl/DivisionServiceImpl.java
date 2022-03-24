package com.example.casestudy.service.Employee.Impl;

import com.example.casestudy.model.Employee_model.Division;
import com.example.casestudy.repository.Employee.IDivisionRepository;
import com.example.casestudy.service.Employee.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {
    @Autowired
    private IDivisionRepository iDivisionRepository;


    @Override
    public List<Division> findAll() {
        return iDivisionRepository.findAll();
    }
}
