/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap08.Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class GenericCollection {
    public static void main(String[] args) {
        genericCollectionList();
        genericCollectionMap();
    }
    public static void genericCollectionMap(){
        Map<Integer, String> mapObj = new HashMap<Integer, String>();
        mapObj.put(1,"!23");
        mapObj.put(123, "134");
        Iterator<Integer> itr = mapObj.keySet().iterator();
        while(itr.hasNext()){
            int index = itr.next();
            String value = mapObj.get(index);
            System.out.println(index + ": " + value);
        }
    }
    
    public static void genericCollectionSet(){
        Set<String> setObj = new HashSet <String>();
        setObj.add("Java");
        setObj.add("Object");
        //setObj.add(5);
        Iterator itr = setObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
    public static void genericCollectionList(){
        List listObj = new ArrayList();
        listObj.add(12);
        listObj.add(11);
        listObj.add(13);
        listObj.add(4.5);
        listObj.add("hello");
        Iterator itr = listObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        List<Course2> listCourse = new ArrayList <Course2>();
        listCourse.add(new Course2("Hello",12,123));
    }
}
