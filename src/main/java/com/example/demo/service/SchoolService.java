package com.example.demo.service;

import com.example.demo.model.School;
import com.example.demo.model.Student;
import com.example.demo.repostiory.SchoolRepository;
import com.example.demo.repostiory.StudentRepository;
import com.fasterxml.jackson.databind.BeanProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void findStudentInfo() {
        School school = new School("매력고");
        schoolRepository.save(school);

        Student stu1 = new Student("나라");
        Student stu2 = new Student("인하");
        Student stu3 = new Student("나나");

        stu1.setSchool(school);
        stu2.setSchool(school);
        stu3.setSchool(school);

        studentRepository.save(stu1);
        studentRepository.save(stu2);
        studentRepository.save(stu3);

        // 학생 객체를 기준으로 조회함
        List<Student> students = studentRepository.findAll();

        for (Student s : students) {
            System.out.println(s.getUserName() + "," + s.getSchool().getName());
        }
    }

    @Transactional
    public void findSchoolInfo() {
        School sc1 = new School("예체능고");
        sc1.registerStudent(new Student("홍길동"));
        sc1.registerStudent(new Student("유재석"));

        School sc2 = new School("매력고");
        sc2.registerStudent(new Student("나라"));
        sc2.registerStudent(new Student("민하"));

        Set<School> sc = new HashSet<School>();
        sc.add(sc1);
        sc.add(sc2);

        schoolRepository.save(sc1);
        schoolRepository.save(sc2);

        List<School> schools = schoolRepository.findAll();

        for (School s : schools) {
            System.out.println(s.toString());
        }


    }

}
