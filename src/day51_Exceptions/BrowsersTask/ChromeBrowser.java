package day51_Exceptions.BrowsersTask;
/*
    2. create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser
 */
public class ChromeBrowser extends WebDriver{

   @Override

   public void get(String url){
      System.out.println("opening the " + url + " in the chrome browser");

   }
   public void close(){
      System.out.println("closing the chrome browser");
   }

}
