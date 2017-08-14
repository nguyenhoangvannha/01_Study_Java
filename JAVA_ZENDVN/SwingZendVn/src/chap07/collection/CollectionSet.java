/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap07.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CollectionSet {
//    Set interface:
//	-Khong chua cac phan tu trung nhau
//	-HashSet Cac phan tu khong luu tru theo chi so
//	-LinkedHashSet: giu nguyen thu tu
//	-TreeSet: cac phan tu duoc xep tang dan
    public static void main(String[] args) {
        hashSet();
    }
    public static void linkedHashSet(){
        
    }
    public static void hashSet(){
        Set setObj = new HashSet();
        int a = 123;
        char b = 'b';
        String str = "String";
        double d = 32.54;
        Course java = new Course("Zendvn day nhu xi", 100000);
        setObj.add(a);
        setObj.add(a);
        setObj.add(b);
        setObj.add(str);
        setObj.add(d);
        setObj.add(java);
        Iterator itr = setObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
