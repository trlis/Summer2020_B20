package day36;

import java.util.ArrayList;

public class warmUpTask {
    /*
    warmup tasks:
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
    3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}

     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(4, 0);
        System.out.println(list);

        System.out.println("================ Task 2 =================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 1; i<=20; i++){
            list2.add(i);
        }

        System.out.println(list2);

        for(int i = 0; i<=list2.size()-1; i++){
         Integer each = list2.get(i);
         if(each%2 != 0){
             list2.set(i, each*2);
         }else{
             list2.set(i, each*3);
         }
        }
        System.out.println(list2);



            }

            }


