/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Static

package Chap02.Oop;

import java.util.Calendar;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Person {
    private String name;
    private int birthday;
    private String ID;

    //Show info
    public void showInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getID());
        System.out.println("Birth day: " + this.getBirthday());
    }
    public int getAge(){
        int age;
        Calendar now = Calendar.getInstance();
        age = now.get(Calendar.YEAR) - this.getBirthday();
        return age;
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
     * @return the birthday
     */
    public int getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(int birthday) {
        this.birthday = birthday;
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
}
