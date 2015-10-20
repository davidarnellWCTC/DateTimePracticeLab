/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author darnell
 */
public class OldDatePractice {
    public static void main(String[] args) {
        
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        
        date2.add(Calendar.DATE, 30);
        
        boolean isAfter = date2.after(date1);
        
        System.out.println(isAfter);
        
        Calendar aDate = Calendar.getInstance();
        aDate.add(Calendar.YEAR, 5);
        SimpleDateFormat sdf = new SimpleDateFormat("M.d.yyyy h:m a");
        
        Date date = aDate.getTime();
        String s = sdf.format(date);
        
        System.out.println("The adjust Date: " + s);
        
//        Date startDate = new Date();
//        Date endDate = new Date(2015-1900,9,23);
        
//        Calendar startDate = Calendar.getInstance();
//        Calendar endDate = Calendar.getInstance();
//        endDate.set(2015, Calendar.OCTOBER, 23);
//        
//        long startTime = startDate.getTimeInMillis();
//        long endTime = endDate.getTimeInMillis();
//        long differenceInHrs = (endTime - startTime)/(1000*3600);
//        
//        System.out.println(differenceInHrs);
        
//        Date date1 = new Date();
//        
//        System.out.println("Default format: " + date1);
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:m a");
//        
//        String myFormat = sdf.format(date1);
//        System.out.println("My Format: " + myFormat);
//        
//        Calendar date2 = Calendar.getInstance();
//        String s = sdf.format(date2.getTime());
//        System.out.println(date2);
//        System.out.println("Calendar Version: " + s);
        
    }
    
}
