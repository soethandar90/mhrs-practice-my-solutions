package mhrs.techInter.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Firstname", "Soe");
        hm.put("Lastname", "Thandar");
        //System.out.println(hm);
        //System.out.println(hm.get("Firstname"));
        //System.out.println(hm.remove("Firstname", "Moe"));
        //System.out.println(hm.remove("Firstname", "Soe"));
        //System.out.println(hm);
        hm.put("S","Amit");
        hm.put("AK","Vijay");
        hm.put("47","Rahul");
        System.out.println("Initial list of elements:");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.clear();
        System.out.println(hm);
    }

}
