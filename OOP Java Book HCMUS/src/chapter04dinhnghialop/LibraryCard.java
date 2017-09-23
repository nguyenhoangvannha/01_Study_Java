/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04dinhnghialop;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class LibraryCard {
    private Student owner;
    private int borrowCnt;

    /**
     * @return the owner
     */
    public Student getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Student owner) {
        this.owner = owner;
    }

    /**
     * @return the borrowCnt
     */
    public int getNumberOfBooks() {
        return borrowCnt;
    }

    /**
     * @param numOfBooks the numOfBooks to set
     */
    public void checkOut(int numOfBooks) {
        this.borrowCnt += numOfBooks;
    }
    
    public String toString(){
        return "Owner name:" + owner.getName()
                +"\nOwner email:" + owner.getEmail()
                +"\nBooks borrowed:"+ this.borrowCnt;
    }
}
