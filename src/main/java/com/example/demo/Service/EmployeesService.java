package com.example.demo.Service;

import com.example.demo.Entity.EmployeesEntity;
import com.example.demo.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesService {

    @Autowired
    EmployeesRepository employeesRepository;

    public EmployeesEntity getById() {

        return employeesRepository.getById(10001);
    }
}
