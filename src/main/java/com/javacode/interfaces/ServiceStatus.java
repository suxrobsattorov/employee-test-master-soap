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
@XmlType(name = "serviceStatus", propOrder = {
        "status",
        "message"
})
public class ServiceStatus {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String message;
}
