package com.example.casestudy.service.Employee.Impl;

import com.example.casestudy.model.Employee_model.EducationDegree;
import com.example.casestudy.repository.Employee.IEducationDegreeRepository;
import com.example.casestudy.service.Employee.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    private IEducationDegreeRepository iEducationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return iEducationDegreeRepository.findAll();
    }
}
