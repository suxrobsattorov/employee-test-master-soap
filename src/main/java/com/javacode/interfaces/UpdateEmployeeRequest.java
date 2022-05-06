package com.javacode.interfaces;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "employeeInfo"
})
@XmlRootElement(name = "updateEmployeeRequest")
public class UpdateEmployeeRequest {

    @XmlElement(required = true)
    protected EmployeeInfo employeeInfo;
}
