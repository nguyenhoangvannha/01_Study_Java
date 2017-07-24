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
public class Student {
    private String name = "";
    private String ID = "";
    private int birthDay = 0;

    /**
     * @return the name
     */
    protected String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    protected String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    protected void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the birthDay
     */
    protected int getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    protected void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
}
