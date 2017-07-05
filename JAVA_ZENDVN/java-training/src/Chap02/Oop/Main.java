/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap02.Oop;

import java.util.Scanner;


/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        Book newBook = new Book();

        do{
            System.out.print("=========== BOOK MANAGER ==========="
                       + "\n1.Add book"
                       + "\n2.Edit book"
                       + "\n3.Info book"
                       + "\n4.Exit"
                       + "\nYour choise: ");
            choise = sc.nextInt();
            sc.nextLine();
            switch(choise){
                case 1: String name,ID;
                        int price;
                        System.out.print("Enter ID: ");
                        ID = sc.nextLine();
                        System.out.print("Enter name: ");
                        name = sc.nextLine(); 
                        System.out.print("Enter price: ");
                        price = sc.nextInt();
                        newBook.add(ID, name, price);
                    break;
                case 2: newBook.edit();
                    break;
                case 3: newBook.info();
                    break;
                case 4: 
                    break;
                default:
                    break;
        }
        } while(choise != 4);
        sc.close();
    }
    public static void Frac(String[] args) {
        Fraction f1 = new Fraction(3, 9);
        Fraction f2 = new Fraction(2, 3);
        f1.normalize();
        System.out.println(f1.print() + "\t" + f2.print());
        System.out.println(Fraction.add(f1, f2).print());
        System.out.println(Fraction.sub(f1, f2).print());
        System.out.println(Fraction.multiply(f1, f2).print() + "\t" + Fraction.divide(f1, f2).print());
    }
    //Static
    public static void staticc(String[] args) {
        Counter c1 = new Counter();
        System.out.println(c1.getCount());
        Counter c2 = new  Counter();
        System.out.println(c1.getCount());

    }
    public static void start(String[] args) {
        System.out.println("Object orainted programing.");
        Student studentOne = new Student();
        studentOne.setBirthday(1997);
        studentOne.setName("Nguyen Hoang Van Nha");
        studentOne.setID("1512363");
        studentOne.setScore(13.4);
        studentOne.showInfo();
        System.out.println(studentOne.getAge());
    }
}
