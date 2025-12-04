package oop_projects;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    hashMap.put("milk", 4);
    hashMap.put("egg", 2);
    hashMap.put("bread", 1);
    
    for(String h : hashMap.keySet()) {
    	System.out.println(h+" = "+hashMap.get(h)+"dh");
    }
        	
    }
    	
}
