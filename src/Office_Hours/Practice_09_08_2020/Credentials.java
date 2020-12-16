package Office_Hours.Practice_09_08_2020;

public class Credentials {

    private String userName = "Cybertek";
    private String pw = "CyberTek1234";


    public String getUserName(){
        return  userName;
    }

    public void setUserName(String userName){ //Modify

        this.userName = userName;

    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
