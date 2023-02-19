package com.masum;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapConCurrent {
    public static void main(String[] args){
        Map<String, String> myMap = new ConcurrentHashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "1");
        myMap.put("3", "1");
        myMap.put("4", "1");
        myMap.put("5", "1");
        myMap.put("6", "1");
        System.out.println("ConcurrentHashMap Before Iteration : " + myMap);

        Iterator<String> itr1 = myMap.keySet().iterator();

        while (itr1.hasNext()){
            String key = itr1.next();
            if (key.equals("3")) myMap.put(key+"new", "new3");
        }
        System.out.println("Concurrent After Iteration : " + myMap);
    }
}
