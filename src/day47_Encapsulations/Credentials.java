package day47_Encapsulations;

public class Credentials {

    private String username;
    private String password;

    String name;
    int age;


    public static String companyName;

    static {
        companyName = "FaceBook";

    }

    public Credentials(String name,int age){
      this.name = name;
      this.age = age;


    }


    public void setUsername(String username){
        this.username = username;

    }
    public void setPassword(String password){
        this.password = password;

    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }





}
