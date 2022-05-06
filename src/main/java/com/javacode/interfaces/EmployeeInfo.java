package com.javacode.interfaces;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeInfo", propOrder = {
        "id",
        "name",
        "department",
        "phone",
        "address"
})
public class EmployeeInfo {

    protected Long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String department;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String address;
}
