/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07.Collection;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Course {
    private String name;
    private int time;
    public Course(String name,int time){
        this.setName(name);
        this.setTime(time);
    }

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
     * @return the time
     */
    protected int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    protected void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +"\nTime: " + this.getTime();
    }
    
}
