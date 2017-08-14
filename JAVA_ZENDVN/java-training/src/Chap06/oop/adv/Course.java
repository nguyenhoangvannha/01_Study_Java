/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06.oop.adv;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class Course {
    private int time;
    private String name;
    private static int chapter = 12;
    //inner nested class
    static class StaticClass{
        public void showStaticInfo(){
            System.out.println("Chapter static: " + chapter);
        }
    }
    
    class CourseOnline{
        private int cost = 100;

        /**
         * @return the cost
         */
        protected int getCost() {
            return cost;
        }

        /**
         * @param cost the cost to set
         */
        protected void setCost(int cost) {
            this.cost = cost;
        }
        
        public void showCourseOnlineInfo(){
            System.out.println("Price: " + this.getCost());
            System.out.println("Inner to super time:" + time);
        }
    }
    
    public void showInfo(){
        System.out.println("Name: " + this.getName());
        System.out.println("Time: " + this.getTime());
        
        //Local inner class
        class CourseOnlineCopy{
            private int cost = 100;

            /**
             * @return the cost
             */
            protected int getCost() {
                return cost;
            }

            /**
             * @param cost the cost to set
             */
            protected void setCost(int cost) {
                this.cost = cost;
            }

            public void showCourseOnlineInfoCopy(){
                System.out.println("Price: " + this.getCost());
                System.out.println("Inner to super time:" + time);
            }
        }
        CourseOnlineCopy copyObj = new CourseOnlineCopy();
        copyObj.showCourseOnlineInfoCopy();
    }
    public Course(String name, int time){
        this.setName(name);
        this.setTime(time);
    }

    @Override
    public boolean equals(Object obj) {
        Course temp = (Course) obj;
        if(temp.getName() == this.getName() && temp.getTime() == this.getTime()){
            return true;
        } else{
            return false;
        }
        //return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String toString() {
        return "Name: " + this.getName() + "\nTime: " + this.getTime();
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
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
}
