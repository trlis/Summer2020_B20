package day29_CustomMethods;

/*
 8. write a method that can print out the unique elements from an array of string
 */
public class Task8_UniqueElements {

    public static void main(String[] args) {


        String[] arr = {"A", "B", "B", "C"};
        unique(arr);

    }

    public static void unique(String[] arr){

        for(String letter: arr){ //gets each of the element
            int count= 0;
            for(String each : arr){ //gets the frequency of the element
                if(letter.equals(each)){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(letter +  " ");

            }

        }
        System.out.println();



    }

                }

/*
for(int j = 0; j<= str.length()-1;j++) {
            int count = 0;
            char ch = str.charAt(j);

            for (int i = 0; i <= str.length() - 1; i++) {

                char each = str.charAt(i);
                if (each == ch) {
                    count+=1;
                }
            }

            if (count == 1) {
                expectResult += ch;
            }
        }
        System.out.println(expectResult);
 */
