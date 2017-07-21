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
public class CollectionComparable {
    public static void main(String[] args) {
        Course courseJava = new Course("java",623);
        Course courseWindows = new Course("win",234);
        Course courseLinux = new Course("linux",345);
        ArrayList arrCourse = new ArrayList();
        arrCourse.add(courseJava);
        arrCourse.add(courseWindows);
        arrCourse.add(courseLinux);
        Collections.sort(arrCourse);
        Iterator itr = arrCourse.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }

   
}
