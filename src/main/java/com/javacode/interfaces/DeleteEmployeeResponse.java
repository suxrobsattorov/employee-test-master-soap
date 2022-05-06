package com.javacode.interfaces;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceStatus"
})
@XmlRootElement(name = "deleteEmployeeResponse")
public class DeleteEmployeeResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
}
