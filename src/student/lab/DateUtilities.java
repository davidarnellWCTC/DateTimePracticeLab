/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Student API: students should complete this lab by one week from today: Create
 * a custom "DateUtilities" class similar to the one demonstrated by your
 * instructor. However, yours should use the new Java 8 Date/Time API. You must
 * provide a minimum of two methods for converting Date/Time objects to
 * formatted strings; and you must provide a minimum of two methods to convert
 * formatted strings to Date/Time objects. And you must provide at least one
 * method for performing Date/Time arithmetic, such as the number of months,
 * days, minutes, etc., between two dates. Experimentation is crucial to your
 * success!
 *
 * @author darnell
 */
public class DateUtilities {

    public static void main(String[] args) {
        
        // convert current date to formatted string
        
    public String getCurrentDateAsFormattedString() {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
        LocalDateTime currentDate = LocalDateTime.now();

        String strCurrentDate = currentDate.format(format);
        System.out.println(strCurrentDate);
        
        return strCurrentDate;
    }

    // convert current time to formatted string
    // convert date object to formatted string
    // add minutes to current date
    // add hours to current date
    // add days to current date
    // add weeks to current date
    // add months to current date
    // add years to current date

    }
}
