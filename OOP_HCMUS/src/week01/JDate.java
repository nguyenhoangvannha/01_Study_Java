/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week01;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class JDate {
    public int day;
    public int month;
    public int year;
    public JDate(){
        
    }
    public JDate(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public static boolean checkDate(JDate date){
        if(date.getYear() < 0){
            System.out.println("Year have to >= 0");
            return false;
        } else if(date.getMonth() < 1 || date.getMonth() > 12){
            System.out.println("1 <= Month <= 12");
            return false;
        } else {
            switch(date.getMonth()){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if(date.getDay() < 1 || date.getDay() > 31){
                        System.out.println("1 <= day <= 31");
                        return false;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if(date.getDay() < 1 || date.getDay() > 30){
                        System.out.println("1 <= day <= 30");
                        return false;
                    }
                    break;
                case 2:
                    if((date.getDay() < 1 || date.getDay() > 29) && inspectLeapYear(date)){
                        System.out.println("1 <= day <= 29");
                        return false;
                    }
                    if((date.getDay() < 1 || date.getDay() > 28) && !inspectLeapYear(date)){
                        System.out.println("1 <= day <= 28");
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
    
    public static boolean inspectLeapYear(JDate date){
        if((date.getYear() % 400 == 0) || (date.getYear() % 4 == 0 && date.getYear() % 100 != 0)){
            return true;
        } else{
            return false;
        }
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }
    
}
