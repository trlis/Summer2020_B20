package day62_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class SetEntryForMap {

    public static void main(String[] args) {

        //we want to store username & passwords into one DAta structure

        Map<String, String> vyTrackCredentials= new LinkedHashMap<>();
        vyTrackCredentials.put("username1", "password1");
        vyTrackCredentials.put("username2", "password2");
        vyTrackCredentials.put("username3", "password3");
        vyTrackCredentials.put("username4", "password4");
        vyTrackCredentials.put("username5", "password5");
        vyTrackCredentials.put("username6", "password6");
        vyTrackCredentials.put("username7", "password7");
        vyTrackCredentials.put("username8", "password8");
        vyTrackCredentials.put("username9", "password9");

        for( Map.Entry<String, String> each : vyTrackCredentials.entrySet()){

            String userName = each.getKey();
            String password= each.getValue();
            System.out.println("username: "  + userName + ", password: " + password);
        }

    }
}
