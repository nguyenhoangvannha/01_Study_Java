/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

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
    public Book(String ID, String name, int price){
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + this.getID() + "\t  Name: " + this.getName() +  "\tPrice: " + this.getPrice();
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
}
