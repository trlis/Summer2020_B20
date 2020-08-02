package day37_ArrayList;

import Library.Util;

import javax.sound.midi.Soundbank;
import java.beans.beancontext.BeanContextChildComponentProxy;
import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str ="AABBCDDEEF";

        ArrayList<String> list = new ArrayList<>();

        for(String each : str.split("")){
            list.add(each);
        }
        System.out.println(list);

        //Not finished
        String nonDup = Util.removeDuplicates(str);
        for(String each : list){
            int count = Collections.frequency(list, each);
            System.out.print(each + count);
        }

    }
}
