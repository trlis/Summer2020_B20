package day51_Exceptions.BrowsersTask;

public class OperaBrowser extends WebDriver {


    public void get(String url){
        System.out.println("opening the " + url + " in the opera browser");

    }
    public void close(){
        System.out.println("closing the opera browser");
    }
}
