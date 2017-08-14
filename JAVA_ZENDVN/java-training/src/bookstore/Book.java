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
public class Book {
    private String ID;
    private String name;
    private int price;
    public Book(){
    }
    public void add(String ID,String name,int price){
        this.setID(ID);
        this.setName(name);
        this.setPrice(price);
    }
    public void info(){
        System.out.println("ID: " + this.getID() + "\nName: " + this.getName() + "\nPrice: " + this.getPrice());
    }
    public void edit(){
        Scanner sc = new Scanner(System.in);
        int choise;
        do{
            System.out.println("1. Edit ID \n2.Edit name\n3.Edit price\n4.Edit all \n5.Exit\nYour choose: ");
            choise = sc.nextInt();
            sc.nextLine();
            String name,ID;
            int price;
            switch(choise){
                case 1: System.out.print("Enter new ID: ");
                    ID = sc.nextLine();
                    this.setID(ID);
                    break;
                case 2: System.out.print("Enter new name: ");
                    name = sc.nextLine();
                    this.setName(name);
                    break;
                case 3: System.out.print("Enter new price: ");
                    price = sc.nextInt();
                    this.setPrice(price);
                    break;
                case 4: 
                        System.out.print("Enter new ID: ");
                        ID = sc.nextLine();
                        System.out.print("Enter new name: ");
                        name = sc.nextLine(); 
                        System.out.print("Enter new price: ");
                        price = sc.nextInt();
                        this.add(ID, name, price);
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while(choise != 5);
        //sc.close();
    }
    /**
     * @return the name
     */
    protected String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    protected String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    protected void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the price
     */
    protected int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    protected void setPrice(int price) {
        this.price = price;
    }
    
}
