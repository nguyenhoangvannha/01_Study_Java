/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03dulieuso;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author NGUYENHOANGVANNHA
 */
public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar independenceDay = new GregorianCalendar(1945, Calendar.SEPTEMBER, 2);
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("getTime:" + cal.getTime());
        System.out.println("YEAR:" + cal.get(Calendar.YEAR));
        System.out.println("DAY_OF_YEAR:" + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK_OF_YEAR:" + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM:" + cal.get(Calendar.AM_PM));
        System.out.println("HOUR_OF_DAY" + cal.get(Calendar.HOUR_OF_DAY));
    }
}
