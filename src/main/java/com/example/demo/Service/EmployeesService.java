package com.example.demo.Service;

import com.example.demo.Entity.EmployeesEntity;
import com.example.demo.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeesService {

    final private EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public EmployeesEntity getById(Integer id) {
        return employeesRepository.getById(id);
    }

}
