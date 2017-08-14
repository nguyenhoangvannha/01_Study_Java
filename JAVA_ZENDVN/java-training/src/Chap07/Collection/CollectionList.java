/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CollectionList {
    public static void main(String[] args) {
        arrayList();
    }
    public static void arrayList(){
        
        //create
        List listObj = new ArrayList();
        
        //add elements
        listObj.add("Java"); //index : 0 String
        listObj.add(12);     //index : 1 int
        listObj.add(12.3);   //index : 2 double
        listObj.add(true);   //index : 3 boolean
        listObj.add(12);     //index : 4 int
        Course courseObj = new Course("php",121);
        listObj.add(courseObj); // index 5 : Course
        
        //size
        System.out.println("Length: " + listObj.size());
        
        //get elements
        System.out.println(listObj.get(0));
        
        //Set elements
        listObj.set(0, 123);
        System.out.print(listObj.get(0));
        
        //print all elements
        for(int i =0 ; i < listObj.size(); i++){
            System.out.println(listObj.get(i));
        }
        
        //print all elements
        Iterator itr = listObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void linkedList(){
        
    }
}
