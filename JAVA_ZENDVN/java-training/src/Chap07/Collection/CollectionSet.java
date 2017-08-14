/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CollectionSet {
    public static void main(String[] args) {
        hashSet();
    }
    public static void treeSet(){
        Set setObj = new TreeSet();
        setObj.add(2);
        setObj.add(5);
        setObj.add(2);
        setObj.add(6);
        setObj.add(1);
        setObj.add(23);
        setObj.add(6);
        Iterator itr = setObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    //
    public static void linkedHashSet(){
        Set setObj = new LinkedHashSet();
        setObj.add(2);
        setObj.add(5);
        setObj.add(2);
        setObj.add(6);
        setObj.add(1);
        setObj.add(23);
        setObj.add(6);
        Iterator itr = setObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    //
    public static void hashSet(){
        Set setObj = new HashSet();
        setObj.add(2);
        setObj.add(5);
        setObj.add(2);
        setObj.add(6);
        setObj.add(1);
        setObj.add(23);
        setObj.add(6);
        Iterator itr = setObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
