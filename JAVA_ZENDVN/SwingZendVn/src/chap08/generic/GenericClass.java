/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap08.generic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class GenericClass {
    public static void main(String[] args) {
        CourseAdv<String, String> courseObj = new CourseAdv("Java", 25, 10);
        CourseAdv<String, String> courseObj2 = new CourseAdv();
        //courseObj2.setTime(12); //error
    }
}
