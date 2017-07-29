/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap07.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CollectionList {
//    List interface:
//	-Cac phan tu duoc them vao co the trung nhau
//	-Cac phan tu luu tru theo chi so
//	ArrayList:
//	-Su dung khi luu tru cac phan tu ma khong chinh sua nhieu
//	LinkedList:
//	-Su dung khi cac phan tu duoc chinh sua thuong xuyen
    public static void main(String[] args) {
        arrayList();
    }
    public static void linkedList(){
        List arrListObj = new LinkedList();
        int a = 123;
        char b = 'b';
        String str = "String";
        double d = 32.54;
        Course java = new Course("Zendvn day nhu xi", 100000);
        arrListObj.add(a);
        arrListObj.add(b);
        arrListObj.add(str);
        arrListObj.add(d);
        arrListObj.add(java);
        for(int i = 0; i < arrListObj.size(); i++){
            System.out.println(arrListObj.get(i));
        }
        
        //edit elements
        arrListObj.set(1, "Edit cc");
        
        //print all elements
        for(Object elm: arrListObj){
            System.out.println(elm);
        }
        
        
        arrListObj.remove(1);
        //print all elements method 2
        
        Iterator itr = arrListObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void arrayList(){
        List arrListObj = new ArrayList();
        int a = 123;
        char b = 'b';
        String str = "String";
        double d = 32.54;
        Course java = new Course("Zendvn day nhu xi", 100000);
        arrListObj.add(a);
        arrListObj.add(b);
        arrListObj.add(str);
        arrListObj.add(d);
        arrListObj.add(java);
        for(int i = 0; i < arrListObj.size(); i++){
            System.out.println(arrListObj.get(i));
        }
        
        //edit elements
        arrListObj.set(1, "Edit cc");
        
        //print all elements
        for(Object elm: arrListObj){
            System.out.println(elm);
        }
        
        
        arrListObj.remove(1);
        //print all elements method 2
        
        Iterator itr = arrListObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
