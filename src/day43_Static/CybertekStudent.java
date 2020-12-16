package day43_Static;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class CybertekStudent {


    String studentName;
    int age;
    char gender;
    static String schoolName ="Cybertek School";

    public void getInfo(){
        System.out.println("Name:" + studentName);
    }
    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }


}
