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
@XmlRootElement(name = "updateEmployeeResponse")
public class UpdateEmployeeResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
}
