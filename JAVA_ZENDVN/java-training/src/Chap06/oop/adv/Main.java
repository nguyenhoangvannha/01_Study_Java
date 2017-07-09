/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06.oop.adv;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Main {
    public static void main(String[] args) {
        nestedInnerClass();
    }
    //inner class - nested class
    public static void nestedInnerClass(){
        People.Student obj = new StudentZendVN();
        obj.study();
    }
    
    //inner class - static class
    public static void staticInnerClass(){
        Course.StaticClass obj = new Course.StaticClass();
        obj.showStaticInfo();
    }
    
    //inner class - local inner class (inside a method)
    public static void localInnerClass(){
        Course courseObj = new Course("Android",123);
        courseObj.showInfo();
    }
    
    //inner cass - anonymous inner class
    public static void anonymousInnerClass(){
        People obj = new People() {
            @Override
            public void eat() {
                System.out.println(".eat()");
            }

            @Override
            public void go() {
                System.out.println(".go()");
            }
        };
        obj.eat();
        obj.go();
    }
    
    //inner class - member inner class
    public static void memberInnerClass(){
        Course obj = new Course("java",7);
        Course.CourseOnline onlineObj = obj.new CourseOnline();
        obj.showInfo();
        onlineObj.showCourseOnlineInfo();
    }
    
    //Giam phu thuoc giua cac class
    public static void reduceClass(){
        PlayStation playobj = new PlayStation();
        Fifa fifa = new Fifa();
        playobj.play(fifa);
    }
    
    //Object class
    public static void objectClass(){
        Course java = new Course("java", 70);
        Course php = new Course("php", 123);
        System.out.println(java);
        System.out.println(php);
        if(java.equals(php)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
    
    //interface
    //all method in interface are abstract
    //cannot create an object from interface
    //keyword: implements
    public static void interfaceHuman(){
        SupperMan people1 = new SupperMan();
        people1.eat();
        people1.mainboard();
        people1.fly();
        people1.defaultAbstract();
        People.staticAbstract();
    }
    
    //abstract class
    //Cannot create a object from abstract class
    //overide abstract method
    //keyword: extends
    public static void abstractClass(){
        LaptopDell dell = new LaptopDell();
        dell.mainboard();
        dell.chipset();
        dell.keyboard();
    }
}
