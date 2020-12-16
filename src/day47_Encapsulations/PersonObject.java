package day47_Encapsulations;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {

        Person personInfo = new Person("Kate Grey", 18, 'F', LocalDate.of(2002,8, 15));

        System.out.println(personInfo);

        personInfo.setID(9451856);
        personInfo.setSsn(48643153);
        personInfo.setAddress("North Carolina");

        System.out.println("ID#"+personInfo.getID());
        System.out.println("SSN#" + personInfo.getSsn());
        System.out.println("Adress: " +personInfo.getAddress());
        }
    }

