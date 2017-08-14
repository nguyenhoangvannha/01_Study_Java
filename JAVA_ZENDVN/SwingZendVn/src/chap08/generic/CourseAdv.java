/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap08.generic;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class CourseAdv <T1, T2> {
    private String name;
    private T1 time;
    private T2 chapter;
    public CourseAdv(){
        
    }
    public CourseAdv(String name, T1 time, T2 chapter){
        this.name = name;
        this.time = time;
        this.chapter = chapter;
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
    public T1 getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(T1 time) {
        this.time = time;
    }

    /**
     * @return the chapter
     */
    public T2 getChapter() {
        return chapter;
    }

    /**
     * @param chapter the chapter to set
     */
    public void setChapter(T2 chapter) {
        this.chapter = chapter;
    }
}
