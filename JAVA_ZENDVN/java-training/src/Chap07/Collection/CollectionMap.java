/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07.Collection;

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
        hashMap();
    }
    //Items are in sorted order (index change)
    public static void treeMap() {
        Map mapObj = new TreeMap();
        mapObj.put("mon_01", "PPLTHDT");
        mapObj.put("mon_04", "CTDL");
        mapObj.put("mon_02", "HDH");
        mapObj.put("mon_03", "MMT");
        Iterator itr = mapObj.keySet().iterator();
        while(itr.hasNext()){
            Object key = itr.next();
            Object value = mapObj.get(key);
            System.out.println(key + ": " + value);
        }
    }
    
    //Items are in order (index not change)
    public static void linkedHashMap() {
        Map mapObj = new LinkedHashMap();
        mapObj.put("mon_01", "PPLTHDT");
        mapObj.put("mon_04", "CTDL");
        mapObj.put("mon_02", "HDH");
        mapObj.put("mon_03", "MMT");
        Iterator itr = mapObj.keySet().iterator();
        while(itr.hasNext()){
            Object key = itr.next();
            Object value = mapObj.get(key);
            System.out.println(key + ": " + value);
        }
    }
    
    //Items are not in order (index change)
    public static void hashMap() {
        Map mapObj = new HashMap();
        mapObj.put("mon_01", "PPLTHDT");
        mapObj.put("mon_04", "CTDL");
        mapObj.put("mon_02", "HDH");
        mapObj.put("mon_03", "MMT");
        Iterator itr = mapObj.keySet().iterator();
        while(itr.hasNext()){
            Object key = itr.next();
            Object value = mapObj.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
