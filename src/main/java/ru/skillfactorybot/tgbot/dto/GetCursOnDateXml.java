package ru.skillfactorybot.tgbot.dto;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement(name="GetCursOnDateXML", namespace = "http://web.cbr.ru/")
@Data //Getters and Setters
public class GetCursOnDateXml {
    @XmlElement(name="On_Date", required = true, namespace = "http://web.cbr.ru/") //direction to where (what tag) should be used for this field
    protected XMLGregorianCalendar onDate;
}
