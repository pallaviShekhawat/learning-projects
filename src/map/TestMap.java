package map;

import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,Integer> hm = new TreeMap<>();
        hm.put(2,5);
        hm.put(null,5);
        hm.put(null,10);
        hm.put(null,20);
        System.out.println("Value =" +hm.get(null));

    }
}
