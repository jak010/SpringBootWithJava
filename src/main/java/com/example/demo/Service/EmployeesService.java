package com.example.demo.Service;

import com.example.demo.Entity.EmployeesEntity;
import com.example.demo.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class EmployeesService {

    EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public EmployeesEntity getById() {
        return employeesRepository.getById(10001);
    }

    public Page<EmployeesEntity> FindEmployeesByPageRequest(Pageable pageable) {
        return employeesRepository.findAll(pageable);
    }

}
