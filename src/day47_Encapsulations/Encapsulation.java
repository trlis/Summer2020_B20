package day47_Encapsulations;

public class Encapsulation {

    private long ssn =1234567891;

    public long getSsn(){ //to read private data only

        return ssn;

    }

    public void setSsn(long ssn){
        this.ssn = ssn;


    }

}
