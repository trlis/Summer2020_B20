package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn; //12345
                     //54321

    private final LocalDate Published = LocalDate.of(2020, 9, 8);

    public int getAnInt(){
        return ssn;

    }

    public LocalDate getPublished(){
        return Published;

    }

    public void setSsn(int ssn){
        this.ssn = ssn;

    }

  /*  public void setPublished(LocalDate Published){ // final private data type can not be modifyed at all
        this.Published = Published;

    }
*/
}
