package pl.piwowarski.java10.varFeatures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MapDemo {
    public static void main(String[] args) {
//        Good for readability when the type is obvious:
        var map = new HashMap<String, Integer>();
        map.put("1", 10);
        map.put("2", 20);
        map.put("3", 30);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("entries " + entries);
    }
}
