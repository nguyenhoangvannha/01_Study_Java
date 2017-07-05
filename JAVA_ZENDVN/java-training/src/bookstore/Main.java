/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Scanner;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise;
        Chap02.Oop.Book newBook = new Chap02.Oop.Book();

        do{
            System.out.print("=========== BOOK MANAGER ==========="
                       + "\n1.Add book"
                       + "\n2.Edit book"
                       + "\n3.Info book"
                       + "\n4.Exit"
                       + "\nYour choise: ");
            
            choise = sc.nextInt();
            sc.nextLine();
            try{
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
            } catch(Exception e){
                System.out.println("Error:" + e.getMessage());
                sc.nextLine();
            }
        } while(choise != 4);
        sc.close();
    }
}
