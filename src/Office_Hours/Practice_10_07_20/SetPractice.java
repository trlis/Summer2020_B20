package Office_Hours.Practice_10_07_20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {


        /*String str = null;
        System.out.println(str.toUpperCase());*/

        String[] names = {null, "Dawud", "Selman", "Aslan", "Aslan", "Aslan","Aslan","Aslan", };

        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names));  //random

        System.out.println("Hash set: " + hashSet);


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(names));
        System.out.println("Linked Hash set: " + linkedHashSet); //keeps the insertion order as it is

        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(names));
        System.out.println("Tree Set: " + treeSet);//ALWAYS sorts objects in ascending order

    }
}