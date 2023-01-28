package ru.skillfactorybot.tgbot.dto;

import org.springframework.beans.factory.annotation.Value;
import ru.skillfactorybot.tgbot.dto.GetCursOnDateXml;

//import lombok.Value;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

//this class inherits WebServiceTemplate - that adds convenient mechanisms to interact with SOAP
public class CentralRussianBankService extends WebServiceTemplate {
    //SpringBoot Magic - when starts Spring adds values from application.properties or application.yml files
    @Value("${cbr.api.url}")
    private String cbrApiUrl;
    // Method to get data
    public List<ValuteCursOnDate> getCurrenciesFromCbr() throws DatatypeConfigurationException {
        final GetCursOnDateXml getCursOnDateXml = new GetCursOnDateXml();
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());

        XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        getCursOnDateXml.setOnDate(xmlGregCal);

        GetCursOnDateXmlResponse response = (GetCursOnDateXmlResponse) marshalSendAndReceive(cbrApiUrl,getCursOnDateXml);

        if(response==null){
            throw new IllegalStateException("Could not get response from CBR Service");

        }
        final List<ValuteCursOnDate> courses = response.getGetCursOnDateXmlResult().getValueDate();
        courses.forEach(course->course.setName(course.getName().trim()));
        return courses;
    }

}
