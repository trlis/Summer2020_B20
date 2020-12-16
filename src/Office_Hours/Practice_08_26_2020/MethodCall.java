package Office_Hours.Practice_08_26_2020;

public class MethodCall {
    public static void main(String[] args) {

        String str = "AAAABBCCC";

        String nonDup ="";
        for(int i =0; i<= str.length()-1; i++){
            if(!nonDup.contains(""+ str.charAt(i))){
                nonDup += str.charAt(i);
            }

        }
        System.out.println();
    }

}
