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
public class Account {
    private String ownerName;
    private double balance;
    public Account(){
        
    }
    public void setOwnerName(String name){
        this.ownerName = name;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setInitalBalance(double amt){
        this.balance = amt;
    }
    public double getCurrentBalance(){
        return this.balance;
    }
    public void add(double amt){
        this.balance += amt;
    }
    public void deduct(double amt){
        this.balance -= amt;
    }
}
