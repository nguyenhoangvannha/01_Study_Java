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
public class AccountVer02 {
    private String ownerName;
    private double balance;
    public AccountVer02(String name, double startingBalance){
        this.ownerName = name;
        this.balance = startingBalance;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    /***
     * 
     * @param amt 
     */
    public void add(double amt){
        this.balance += amt;
    }
    
    /***
     * 
     * @param amt 
     */
    public void deduct(double amt){
        this.balance -= amt;
    }
    
    /**
     * @return the balance
     */
    public double getCurrentBalance() {
        return balance;
    }
    
}
