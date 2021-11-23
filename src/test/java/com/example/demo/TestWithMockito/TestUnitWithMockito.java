package com.example.demo.TestWithMockito;

import com.example.demo.Entity.EmployeesEntity;
import com.example.demo.Repository.EmployeesRepository;
import com.example.demo.Service.EmployeesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


import static org.mockito.BDDMockito.*;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TestUnitWithMockito {

    @MockBean
    private EmployeesRepository MockemployeesRepository;

    private EmployeesService employeesService;

    /**
     * Mockito(가짜 객체)를 이용한 테스트 방법
     * <p>
     * 1. Repository의 결과로 반환 될 객체를 사전에 미리 생성해두고 Mock을 사용하는 시점에 데이터를 넣어준다  <br/>
     * &nbsp; &nbsp; - when, 데이터를 언제 생성하는가 <br/>
     * &nbsp; &nbsp; - thenReturn, 생성되면 무엇읋 반환해주는가  <br/>
     * <p>
     * 2. 이후 Service 의 메서드를 호출하면 Mocking 된 객체의 리턴값을 이용해준다.
     */
    @Test
    public void getEmployeeByIdTestWithMockito() {

        // given
        EmployeesEntity employeeEntity = new EmployeesEntity();
        employeeEntity.setEmp_no(10001);

        // when
        when(MockemployeesRepository.getById(10001)).thenReturn(employeeEntity);
        EmployeesEntity employee = MockemployeesRepository.getById(10001);

        // then
        assert employee.getEmp_no() == 10001;
    }
}
