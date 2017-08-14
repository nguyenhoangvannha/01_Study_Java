/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07.Collection;

import java.util.Comparator;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class TimeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Course obj1 = (Course) o1;
        Course obj2 = (Course) o2;
        if(obj1.getTime() > obj2.getTime()) return 1;
        else if (obj1.getTime() < obj2.getTime()) return -1;
        else return 0; 
    }
    
}
