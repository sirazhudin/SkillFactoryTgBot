package ru.skillfactorybot.tgbot.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD) //how to get and set field value
@XmlRootElement(name="GetCursOnDateXmlResult") // the root element - this root element contains the other elements that defined as fields
@Data
public class GetCursOnDateXmlResult {
    @XmlElementWrapper(name ="ValueData", namespace = "")
    @XmlElement(name="ValueCursOnDate",namespace = "")
    private List<ValuteCursOnDate> valueDate = new ArrayList<>();
}
