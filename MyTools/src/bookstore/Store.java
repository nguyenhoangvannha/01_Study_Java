/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Store {
    private String name = "Not named";
    private List<Book> listItems;
    private int MAX_ITEMS = 100;
    public Store(){
        listItems = new ArrayList<Book>();
    }
    private boolean isIDExist(String ID){
        for(int i = 0; i < listItems.size(); i++){
            if(listItems.get(i).getID().equals(ID)) return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(listItems.isEmpty()){
            return true;
        } else{
            return false;
        }
    } 
    public boolean isFull(){
        return listItems.size() == MAX_ITEMS;
    }
    public void setMaxItems(int max){
        this.MAX_ITEMS = max;
    }
    public String addBook(String ID, String name, int price){
        if(this.isFull()){
            return "Error: Store is full";
        } else if(this.isIDExist(ID)){
            return "Error: Book ID is already exist";
        } else {
            Book book = new Book(ID, name, price);
            listItems.add(book);
            return "Success";
        }
    }
    public boolean addBook(Book bookObj){
        if(this.isFull() || this.isIDExist(bookObj.getID())){
            return false;
        } else {
            listItems.add(bookObj);
            return true;
        }
    }

    public String editBook(String ID, String name, int price){
        if(!this.isIDExist(ID)){
            return "Error: The book ID does not exist";
        } else {
            for(int i = 0; i < listItems.size(); i++){
                if(listItems.get(i).getID().equals(ID)){
                    listItems.get(i).setName(name);
                    listItems.get(i).setPrice(price);
                    return "Success!";
                }
            }
            return "Unknow error";
        }
    }
    public String deleteBook(String ID){
        if(!this.isIDExist(ID)){
            return "Error: Book ID does not exist";
        } else{
            for(int i = 0; i < listItems.size(); i++){
                if(listItems.get(i).getID().equals(ID)){
                    listItems.remove(i);
                    return "Success!";
                }
            }
            return "Unknow error!";
        }
    }
    
    public Book maxPrice(){
        if(this.isEmpty()){
            return null;
        } else return Collections.max(listItems, new PriceComparator());
    }
    public Book minPrice(){
        if(this.isEmpty()){
            return null;
        } else return Collections.min(listItems, new PriceComparator());
    }
    public void shuffle(){
        Collections.shuffle(listItems);
    }
    public void sortIDInc(){
        Collections.sort(listItems, new IDComperator());
    }
    public void sortIDDec(){
        Collections.sort(listItems, new IDComperator());
        Collections.reverse(listItems);
    }
    public void sortNameInc(){
        Collections.sort(listItems, new NameComparator());
    }
    public void sortNameDec(){
        Collections.sort(listItems, new NameComparator());
        Collections.reverse(listItems);
    }
    public void sortPriceInc(){
        Collections.sort(listItems, new PriceComparator());
    }
    public void sortPriceDec(){
        Collections.sort(listItems, new PriceComparator());
        Collections.reverse(listItems);
    }
    
    public boolean saveToFile(String path){
        File file = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(randomAccessFile.length());
            for(int i = 0; i < listItems.size(); i++){
                randomAccessFile.writeUTF(listItems.get(i).getID());
                randomAccessFile.writeUTF(listItems.get(i).getName());
                randomAccessFile.writeInt(listItems.get(i).getPrice());
            }
            randomAccessFile.close();
        } catch (FileNotFoundException ex) {
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        } catch (IOException ex) {
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
        return true;
    }
    
    public boolean openFromFile(String path){
        File file = new File(path);
        if(!file.exists()){
            return false;
        } else {
            try {
                RandomAccessFile accessFile = new RandomAccessFile(file, "r");
                int count = 0;
                Book book;
                int max = MAX_ITEMS - listItems.size();
                while(count < max  && accessFile.getFilePointer() != accessFile.length()){
                    book = new Book();
                    book.setID(accessFile.readUTF());
                    book.setName(accessFile.readUTF());
                    book.setPrice(accessFile.readInt());
                    if(this.addBook(book)){
                        count ++; 
                    }
                }
                accessFile.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }
    }
    
    public String autoCreateBooks(int amount){
        if(this.isFull()){
            return "Error: Store is already full";
        } else if(amount > (MAX_ITEMS - listItems.size())){
            return "Error: The amount have to <= " + (MAX_ITEMS - listItems.size());
        } else{
            Book bookObj;
            int count = 0;
            int randomNumber;
            while(count < amount){
                randomNumber = (int)(Math.random()*(2*amount + 1)) + 0;
                bookObj = new Book();
                bookObj.setName("Book name " + (count + randomNumber));
                bookObj.setPrice(count + 12 + randomNumber);
                bookObj.setID("HCMUS-" + randomNumber);
                if(this.addBook(bookObj)){
                    count++;
                }
            }
            return "Success!";
        }
    }
    
    public String info(){
        return "Store name: " + this.name + "\nStore books: " + listItems.size() + " books" +"\nStore size: " + MAX_ITEMS + " books";
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < listItems.size(); i++){
            builder.append(listItems.get(i).toString() + "\n");
        }
        return builder.toString();
    }
    
}
