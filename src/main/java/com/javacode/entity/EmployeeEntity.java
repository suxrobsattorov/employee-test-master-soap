package com.javacode.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class EmployeeEntity implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    private Long id;

    private String name;
    private String department;
    private String phone;
    private String address;
}
