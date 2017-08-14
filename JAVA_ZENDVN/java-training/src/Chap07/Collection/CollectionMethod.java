/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CollectionMethod {
    public static void main(String[] args) {
        ArrayList listObj = new ArrayList();
        listObj.add(2);
        listObj.add(7);
        listObj.add(4);
        listObj.add(6);
        listObj.add(1);
        listObj.add(3);
        listObj.add(5);
        
        //sort method
        Collections.sort(listObj);
        
        //reverse method
        Collections.reverse(listObj);
        
        //find after sorted
        int index = Collections.binarySearch(listObj, 4);
        
        //max min
        System.out.println(Collections.min(listObj));
        
        //mix intems
        Collections.shuffle(listObj);
        
        Iterator itr = listObj.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
    
}
