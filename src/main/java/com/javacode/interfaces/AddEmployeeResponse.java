package com.javacode.interfaces;


import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceStatus",
        "employeeInfo"
})
@XmlRootElement(name = "addEmployeeResponse")
public class AddEmployeeResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected EmployeeInfo employeeInfo;
}
