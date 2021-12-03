package com.example.demo.Controller;

import com.example.demo.Entity.EmployeesEntity;
import com.example.demo.Repository.EmployeesRepository;
import com.example.demo.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
    EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/")
    EmployeesEntity method01() {
        return employeesService.getById();
    }

}
