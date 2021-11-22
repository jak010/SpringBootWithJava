package com.example.demo.Entity;

/*
------------+---------------+------+-----+---------+-------+
| Field      | Type          | Null | Key | Default | Extra |
+------------+---------------+------+-----+---------+-------+
| emp_no     | int(11)       | NO   | PRI | NULL    |       |
| birth_date | date          | NO   |     | NULL    |       |
| first_name | varchar(14)   | NO   |     | NULL    |       |
| last_name  | varchar(16)   | NO   |     | NULL    |       |
| gender     | enum('M','F') | NO   |     | NULL    |       |
| hire_date  | date          | NO   |     | NULL    |       |
+------------+---------------+------+-----+---------+-------+
* */

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;


/*
  - 생성자 자동 생성
 01. @NoArgsConstructor: 파라미터가 없는 기본 생성자를 만들어줌
 02. @AllArgsConstructor: 모든 필드 값을 파라미터로 받는 생성자를 만들어줌
 03. @RequiredArgsConstructor: final이나 @NonNull 인 필드 값만 파라미터 받는 생성자를 만들어줌

 - Data 어노테이션
  @Data는 위에서 설명드린 @Getter, @Setter, @RequiredArgsConstructor,
  @ToString, @EqualsAndHashCode을 한꺼번에 설정해주는 매우 유용한 어노테이션.

* */


@Getter
@Setter
@Entity
@Table(name = "employees")
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeesEntity {


    @Id
    @Column(name = "emp_no")
    private int emp_no;

    @Column(name = "birth_date")
    private java.sql.Date birth_date;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Enumerated(value = EnumType.STRING) // Entity에서 Enum을 사용하는 간단한 방법
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "hire_date")
    private java.sql.Date hire_date;


    public enum Gender {
        M("M"), F("F");

        Gender(String gender) {
        }
    }
}

