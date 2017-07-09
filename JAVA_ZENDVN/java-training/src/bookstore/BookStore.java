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
public class BookStore {
    private final int MAX = 50;
    private int index = -1;
    private Book[] ds = new Book[MAX];
    public void addBook(){
        if(index == 49){
            System.out.println("Nha sach da day!");
        } else{
            index++;
            Scanner sc = new Scanner(System.in);
            String name,ID;
            int price;
            System.out.print("Enter ID: ");
            ID = sc.nextLine();
            System.out.print("Enter name: ");
            name = sc.nextLine(); 
            System.out.print("Enter price: ");
            price = sc.nextInt();
            ds[index].add(ID, name, price);
            sc.close();
        }
    }
    public void editBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID book edit:");
        String ID = sc.nextLine();
        for(int i =0; i <= index; i++){
            if(ds[i].getID() == ID){
                ds[i].edit();
            }
        }
        sc.close();
    }
    public void deleteBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID book delete:");
        String ID = sc.nextLine();
        for(int i =0; i <= index; i++){
            if(ds[i].getID() == ID){
                
            }
        }
        sc.close();
    }
    public void findBook(){
        
    }
    public void listBook(){
        
    }
}
