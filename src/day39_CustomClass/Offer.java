package day39_CustomClass;

public class Offer {
       /*
    Attributes:
            Location, hasBenefit(boolean), salary, WFH(boolean), Job Title

    Actions:
            setInfo, getInfo

    create a class named myOffers
    1.Create 7 objects Offer Class and store them into ArrayList
    2.write a program that can only keep the offers from local area
    3.write a program that can remove all the offers that are not SDET of QA
    4.write a program that can remove all the offers that are not WFH
    5.write a program that can remove all the offers that are not have benefits

     */


    String location;
    boolean hasBenefits;
    int salary;
    boolean WFH;
    String jobTitle;

    public void  setOfferInfo(String offerLocation, boolean offerBenefits, int offerSalary, boolean offerWFH, String offerJobTitle ){

        location = offerLocation;
        hasBenefits = offerBenefits;
        salary = offerSalary;
        WFH =offerWFH;
        jobTitle = offerJobTitle;



    }public  void getOfferInfo(){
        System.out.println("Job Title: " + jobTitle + ", Location: " + location + ", Salary: $" + salary +
                ", benefits are provided: " + hasBenefits + ", WFH possibility: " + WFH ) ;
    }

}
