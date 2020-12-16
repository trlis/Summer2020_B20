package day52_Exception;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10, 20};

        //Exception can be handeled by exception itself or its parent
        try {
            System.out.println(arr[20]); // ArrayIndexOutOfBoundsException can be handled by itself or IndexOutOfBoundException(parent)

        } catch (ArithmeticException e) { //ArithmeticException
            System.out.println("Arithmetic exception is handled");

        } catch (ClassCastException e) {
            System.out.println("Class Cast Exception");

        } catch (ArrayIndexOutOfBoundsException e) { //child -->works --> the one that gets executed
            System.out.println("Index Out Of Bound Exception");


        } catch (IndexOutOfBoundsException e) { //parent -->works
            System.out.println("Index Out Of Bound Exception");

        } catch (RuntimeException e) { // can handle any unchecked Exceptions grandparent  -->works
            System.out.println("Index Out Of Bound Exception");
        }


        /*
            }catch(IndexOutOfBoundsException e){ //parent (parent can never be placed before the child)
            System.out.println("Index Out Of Bound Exception");

          }catch (ArrayIndexOutOfBoundsException) // child (child can never be placed after the parent) <-- error


         */

        //Child can be placed before the parent. BUT first comes first serve. Executed first catch that matches followed will not be executed


        //parent exception class can not be after child relation class

        System.out.println("===========================================");

        String str = "Cybertek";

        try{
            System.out.println(str.charAt(200));
        }catch(RuntimeException e){   // Runtime Exception can handle any unchecked exception
            System.out.println(e.getMessage());
        }
        System.out.println("=============================");

        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }

        System.out.println("==============================================");
        try {
            System.out.println(8/0);
            System.out.println("Try block");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Catch block");
        }finally {
            System.out.println("Finally Block"); // finally block executed. exception is not handled
            /*
            Finally Block
            Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at day52_Exception.MultiCatchBlock.main(MultiCatchBlock.java:66)
             */
        }

        System.out.println("Completed");
        }

    }
