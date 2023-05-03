package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RemoveHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>rm=new HashMap<>();
        rm.put("ASUS",10000);
        rm.put("HP",20000);
        rm.put("LEXUS",30000);
        System.out.println(rm);
        System.out.println(rm.size());
        // getting all keys of map using keySet()
        Set keyset=rm.keySet();
        // iterating over the keys and removing
        // hasNext() method is used to check whether next
        // element present inside the collection or not

        Iterator itr = keyset.iterator();
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        System.out.println(rm.size());
        System.out.println(rm);


    }
}
