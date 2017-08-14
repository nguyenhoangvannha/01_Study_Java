/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap07.collection;

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
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return this.getName() + "-" + this.getTime();
    }
    
}
