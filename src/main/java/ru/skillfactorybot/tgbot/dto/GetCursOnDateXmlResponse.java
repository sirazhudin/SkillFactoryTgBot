package ru.skillfactorybot.tgbot.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "GetCursOnDateXmlResponse", namespace = "http://web.cbr.ru/") //XML tag and namespace
@XmlAccessorType(XmlAccessType.FIELD) //How to get fields for this object
@Data // getters setters
public class GetCursOnDateXmlResponse {
    @XmlElement(name = "GetCursOnDateXMLResult", namespace = "http://web.cbr.ru/") //XML element name and its namespase
    private GetCursOnDateXmlResult getCursOnDateXmlResult;

}
