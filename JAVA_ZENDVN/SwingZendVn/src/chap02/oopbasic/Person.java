/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap02.oopbasic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Person {
    private String name = "";
    private String ID = "";
    private int birthDay = 0;

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
     * @return the birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    public void showInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getBirthDay());
        System.out.println("ID: " + this.getID());
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nAge: " + this.getBirthDay() + "\nID: " + this.getID();
    }
    
}
