/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap08.Generic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Course2 <T1, T2> {
    private String name;
    private T1 time;
    private T2 chapter;
    public Course2(String name, T1 time, T2 chapter){
        this.name = name;
        this.time = time;
        this.chapter = chapter;
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
    protected T1 getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    protected void setTime(T1 time) {
        this.time = time;
    }

    /**
     * @return the chapter
     */
    protected T2 getChapter() {
        return chapter;
    }

    /**
     * @param chapter the chapter to set
     */
    protected void setChapter(T2 chapter) {
        this.chapter = chapter;
    }
}
