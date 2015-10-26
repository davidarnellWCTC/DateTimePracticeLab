/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
        // use this to test this class.
        DateUtilities app = new DateUtilities();
        
        String time = app.addDaysToCurrentLocalDate(5);
        System.out.println(time);
    }
    
    /**
     * Returns the current date and time as an unformatted LocalDateTime object
     * @return - returns LocalDateTime.now()
     */
    public LocalDateTime getCurrentDateTime(){
        return LocalDateTime.now();
    }
    
    /**
     * Returns the current time as an unformatted LocalTime object
     * @return - returns LocalTime.now()
     */
    public LocalTime getCurrentTime(){
        return LocalTime.now();
    }
    
    /**
     * Returns the current date as an unformatted LocalDate object
     * @return - returns LocalDate.now()
     */
    public LocalDate getCurrentDate(){
        return LocalDate.now();
    }
        
    /**
     * Takes the LocalDateTime.now() and converts it to the MM/dd/yyyy hh:mm a format
     * returns the time as a string
     * @return - returns the current date and time as a String
     */
    public String getLocalDateAndTimeAsFormattedString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy  hh:mm a");
        LocalDateTime currentDate = LocalDateTime.now();
        String strCurrentDate = currentDate.format(format);
        return strCurrentDate;
    }

    // convert current time to formatted string
    /**
     * Takes the LocalDateTime.now() and converts it to the hh:mm a format
     * returns the current time as a String
     * @return - returns the current time as a String
     */
    public String getLocalTimeAsFormattedString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime = LocalTime.now();
        String strCurrentTime = currentTime.format(format);
        return strCurrentTime;
    }
    
    
    
    // convert date object to formatted string
    /**
     * Takes the LocalDateTime.now() and converts it to the mm/dd/yyyy format
     * returns the date as a String
     * @return - returns the current date as a String
     */
    public String getLocalDateAsFormattedString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        LocalDate currentDate = LocalDate.now();
        String strCurrentDate = currentDate.format(format);
        return strCurrentDate;
    }
    
    /**
     * This function adds minutes as a double value to the current time.
     * The return is a string value of the current time plus the specified minutes.
     * returns in the hh:mm a format
     * @param minutes - double minutes to add to the current time
     * @return 
     */
    public String addMinutesToCurrentLocalTime(double minutes){
        String timePlusMinutes = "";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("mm:hh a");
        LocalTime currentTime = LocalTime.now();        
        timePlusMinutes =currentTime.plusMinutes((long) minutes).format(format);        
        return timePlusMinutes;
    }
    
    /**
     * This function adds minutes as a double value to the current time.
     * The return is a string value of the current time plus the specified minutes.
     * returns in the hh:mm a format
     * @param minutes - double minutes to add to the current time
     * @return 
     */
    public String addHoursToCurrentLocalTime(double hours){
        String timePlusMinutes = "";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime = LocalTime.now();        
        timePlusMinutes =currentTime.plusHours((long) hours).format(format);        
        return timePlusMinutes;
    }
    
    public String addDaysToCurrentLocalDate(double days){
        String currentDatePlusDays = "";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        LocalDateTime currentDate = LocalDateTime.now();
        //currentDatePlusDays = currentDate.plusDays((long) days).format(format);
        currentDatePlusDays = currentDate.plusDays((long) days).format(format);
        return currentDatePlusDays;
    }
    
    
    
    // do math with date
}

