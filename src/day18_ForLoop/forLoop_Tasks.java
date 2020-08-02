package day18_ForLoop;

public class forLoop_Tasks {
    public static void main(String[] args) {

        System.out.println("====TASK 1=====");

        for(int evenNum = 0; evenNum <=1000; evenNum++){
            if(evenNum%2 ==0)
            System.out.print(evenNum + ",");
        }

        System.out.println("\n====TASK 2=====");

        for(int oddNum =0; oddNum<=1000; oddNum++){
            if(oddNum%2 ==1)
                System.out.print(oddNum + ",");
        }

        System.out.println("\n====TASK 3=====");

        for(char az = 'a'; az <= 'z'; az++){
            System.out.print(az);
        }

        System.out.println("\n====TASK 4=====");
        
        for(char AZ = 'A'; AZ <= 'Z'; AZ++){
            System.out.print(AZ);
        }




        }

    }


