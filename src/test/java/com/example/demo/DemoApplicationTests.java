package com.example.demo;


import com.example.demo.Entity.EmployeesEntity;
import com.example.demo.Repository.EmployeesRepository;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.test.context.junit4.SpringRunner;


/**
 * DataJpaTest를 이용한 unittest
 *
 * @author KoJian
 * @version 0.1
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DemoApplicationTests {

    EmployeesEntity employeesEntity = new EmployeesEntity();

    @Autowired
    private EmployeesRepository employeesRepository;


    /**
     * 일반적인 테스트 방법 <br/>
     * <p>
     * 01. 의존성 주입을 사용 <br/>
     * &nbsp;&nbsp; - 실제 DB에 대한 쿼리를 날리기 때문에 코스트가 들어감 <br/>
     */
    @Test
    public void getEmployeeByIdTest() {
        employeesEntity = employeesRepository.getById(10001);
        assert employeesEntity.getEmp_no() == 10001;
    }


}
