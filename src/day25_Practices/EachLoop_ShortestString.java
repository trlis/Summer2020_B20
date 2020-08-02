package day25_Practices;

public class EachLoop_ShortestString {
    public static void main(String[] args) {

        //Find the minimum length of the shortest string from the array


        String[] arr = {"Alan", "Obi", "Ali", "Faith", "Muhtar"};

        int minLength = arr[0].length();
        //assign variable "minLength" that will contain length of the first string in array
        //(assume that during the first iteration it is the shortest string that we have)

        for (String each : arr) {
            // we have to have String DataType for "each" since "arr" is a string and we retrieve each String first
            // to find length of each string later on

            int l = each.length();
            //we assign variable "l" that contain length of "each" string in the array

            if (l < minLength) {
                minLength = l;
            }
        }


        for (String each : arr) {
        // to see how many strings' lengths in the array is matching with minLength

            if (each.length() == minLength) {
                System.out.println(each);


            }
        }

    }
}



/*
        int minLength = arr[0].length(); //3

        for(String each  : arr ){  // to find out the minimum lenght of the string in arr
            if(each.length() < minLength){
                minLength = each.length();
            }
        }


        for(String each  : arr){  // to see how many strings' lengths in the array is matching with minLength
            if(each.length() == minLength ){
                System.out.println(each);
            }
        }


    }
}

 */
