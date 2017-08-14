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
public class StoreOlder01 {
    private String name = "The store is not named.";
    private final int MAX_ITEMS = 100;
    private int totalItems = 0;
    private Book[] listItems = new Book[MAX_ITEMS];
    public boolean isEmpty(){
        if(totalItems == 0) return true;
        else return false;
    }
    public boolean isFull(){
        if(totalItems >= MAX_ITEMS) return true;
        else return false;
    }
    public boolean isExistID(String bookID){
        for(int i = 0; i < totalItems; i++){
            if(bookID.equals(listItems[i].getID())) return true;
        }
        return false;
    }
    public void addBook(Book bookObj){
        if(this.isFull()){
            System.out.println("Error: store is full");
        } else{
            listItems[totalItems] = bookObj;
            totalItems++;
        }
    }
    public void editBook(String bookName, String bookID, double bookPrice){
        for(int i = 0; i < totalItems; i++){
            if(listItems[i].getID().equals(bookID)){
                listItems[i].updateInfo(bookName, bookID, bookPrice);
                return;
            }
        }
    }
    public void deleteBook(String bookID){
        for(int i = 0; i < totalItems; i++){
            if(bookID.equals(listItems[i].getID())){
                for(int j = i; j < totalItems; j++){
                    listItems[j] = listItems[j + 1];
                }
                totalItems--;
                break;
            }
        }
    }
    public Book findBook(String bookID){
        for(int i = 0; i < totalItems; i++){
            if(bookID.equals(listItems[i].getID())) return listItems[i];
        }
        return null;
    }
    public void listBook(){
        
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i =0; i < totalItems; i++){
            str.append(listItems[i].getID() + "\t" + listItems[i].getName() + "\t" + listItems[i].getPrice() + "\n");
        }
        return str.toString();
    }
    public String info(){
        return "Store name: " + name + "\nTotal items: " + totalItems + "\nMax items: " + MAX_ITEMS;
    }
    
    public int getTotalItems(){
        return totalItems;
    }
    public int getMaxItems(){
        return MAX_ITEMS;
    }
}