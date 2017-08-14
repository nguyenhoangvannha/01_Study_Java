/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap07.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CollectionMap {
    public static void main(String[] args) {
        //linkedHashMap();
        treeMap();
    }
    public static void treeMap(){
        Map mapObj = new TreeMap();
        mapObj.put("A", "Hello A");
        mapObj.put("E", "Hello E");
        mapObj.put("C", "Hello C");
        mapObj.put("D", "Hello D");
        mapObj.put("B", "Hello B");
        
        
        Iterator itr = mapObj.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(mapObj.get(itr.next()));
        }
    }
    public static void linkedHashMap(){
        Map mapObj = new LinkedHashMap();
        mapObj.put("A", "Hello A");
        mapObj.put("E", "Hello E");
        mapObj.put("C", "Hello C");
        mapObj.put("D", "Hello D");
        mapObj.put("B", "Hello B");
        
        
        Iterator itr = mapObj.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(mapObj.get(itr.next()));
        }
    }
    public static void hashMap(){
        Map mapObj = new HashMap();
        mapObj.put("A", "Hello A");
        mapObj.put("B", "Hello B");
        mapObj.put("C", "Hello C");
        mapObj.put("D", "Hello D");
        mapObj.put("E", "Hello E");
        
        Iterator itr = mapObj.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(mapObj.get(itr.next()));
        }
    }
}
