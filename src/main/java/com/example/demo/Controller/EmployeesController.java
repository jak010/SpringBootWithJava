package com.example.demo.Controller;

import com.example.demo.Entity.EmployeesEntity;
import com.example.demo.Service.EmployeesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
    EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/emp")
    EmployeesEntity method01() {
        return employeesService.getById();
    }

    @GetMapping("/employees")
    @ResponseBody
    public Page<EmployeesEntity> selectEmployees(final Pageable pageable) {
        return employeesService.FindEmployeesByPageRequest(pageable);
    }


}
