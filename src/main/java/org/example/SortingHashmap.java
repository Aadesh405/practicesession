package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortingHashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> gm=new HashMap<>();
gm.put("Asus",10);
        gm.put("HP",1);
        gm.put("ACER",9);
        gm.put("Lenovo",8);
        Iterator<String> it =gm.keySet().iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.println("Brand:  "+key+"     Rank:   "+gm.get(key));
            System.out.println("\n");
            Map<String,Integer> map=new HashMap<>();
            System.out.println("After Sorting");

            TreeMap<String,Integer> tm=new  TreeMap<>(gm);
            Iterator itr=tm.keySet().iterator();
            while(itr.hasNext())
            {
                String key1=it.next();
                System.out.println("Brand:  "+key1+"     Rank:   "+gm.get(key));
            }
        }
    }
}
