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
public class Book implements Comparable{
    private String ID;
    private String name;
    private double price;
    public Book(){
        
    }
    public Book(String name, String ID, double price){
        this.setName(name);
        this.setID(ID);
        this.setPrice(price);
    }
    @Override
    public String toString() {
        return "Name: " + this.getName() +"\nID: " + this.getID() + "\nPrice: " + this.getPrice();
    }
    public void updateInfo(String name, String ID, double price){
        this.setName(name);
        this.setID(ID);
        this.setPrice(price);
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
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
