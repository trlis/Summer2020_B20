package day40;

public class Offer {
    /*
       Offer
        Attribute:
            salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
            setOfferInfo
            getOfferInfo
        MUST use this keyword

     */

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean WFH;
    String jobTitle;
    boolean benefits;

    public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFullTime, boolean WFH,
                             String jobTitle, boolean benefits){


        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.WFH = WFH;
        this.jobTitle = jobTitle;
        this.benefits = benefits;

    }
    public void getOfferInfo(){
        System.out.println("Job Title: " + jobTitle +"\n Location: " +state +"\n Salary: $" + salary + "\n Has PTO: " + hasPTO +
                "\n Full Time position: "+ isFullTime + "\n WFH: " + WFH + "\n Benefits are provided: " + benefits);


    }








}


