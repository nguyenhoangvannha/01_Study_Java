/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Store {
    private String name = "The store is not named.";
    private final int MAX_ITEMS = 100;
    private int totalItems = 0;
    private List<Book> listItems = new LinkedList<Book>();
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
            if(bookID.equals(listItems.get(i).getID())) return true;
        }
        return false;
    }
    public void addBook(Book bookObj){
        if(this.isFull()){
            System.out.println("Error: store is full");
        } else{
            listItems.add(totalItems, bookObj);
            totalItems++;
        }
    }
    public void editBook(String bookName, String bookID, double bookPrice){
        for(int i = 0; i < totalItems; i++){
            if(listItems.get(i).getID().equals(bookID)){
                listItems.get(i).updateInfo(bookName, bookID, bookPrice);
                return;
            }
        }
    }
    public void deleteBook(String bookID){
        for(int i = 0; i < totalItems; i++){
            if(bookID.equals(listItems.get(i).getID())){
                for(int j = i; j < totalItems; j++){
                    listItems.set(j, listItems.get(j + 1));
                }
                totalItems--;
                break;
            }
        }
    }
    public Book findBook(String bookID){
        for(int i = 0; i < totalItems; i++){
            if(bookID.equals(listItems.get(i).getID())) return listItems.get(i);
        }
        return null;
    }
    public void listBook(){
        
    } 

    public void shuffle(){
        Collections.shuffle(listItems);
    }
    
    public void sortPriceIncrease(){
        Collections.sort(listItems, new V3ComparatorPrice());
    }
    public void sortPriceDecrease(){
        Collections.sort(listItems, new V3ComparatorPrice());
        Collections.reverse(listItems);
    }
    
    public void sortNameIncrease(){
        Collections.sort(listItems, new V3ComparatorName());
    }
    
    public void sortNameDecrease(){
        Collections.sort(listItems, new V3ComparatorName());
        Collections.reverse(listItems);
    }
    
    public Book maxPrice(){
        return Collections.max(listItems, new V3ComparatorPrice());
    }
    public Book minPrice(){
        return Collections.min(listItems, new V3ComparatorPrice());
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i =0; i < totalItems; i++){
            str.append(listItems.get(i).getID() + "\t" + listItems.get(i).getName() + "\t" + listItems.get(i).getPrice() + "\n");
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
