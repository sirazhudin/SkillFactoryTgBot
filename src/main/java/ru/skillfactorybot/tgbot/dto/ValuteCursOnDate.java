package ru.skillfactorybot.tgbot.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)//explain how to get and set fields values
@XmlRootElement(name="ValuteCursOnDate")//root element
@Data // generate Getters and Setter automatically ??
public class ValuteCursOnDate {
    @XmlElement(name="Vname") //XML tag's name
    private String name;

    @XmlElement(name="Vnom")
    private int nominal;

    @XmlElement(name="Vcurs")
    private double course;

    @XmlElement(name="Vcode")
    private String code;

    @XmlElement(name="VchCode")
    private String chCode;
}
