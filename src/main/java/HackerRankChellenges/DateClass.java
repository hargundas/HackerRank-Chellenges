package HackerRankChellenges;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateClass {

    static void getCurrentDate(){

        //LocalDateTime to display the current date and time, import the
        LocalDateTime localDateTime =  LocalDateTime.now();
        System.out.println("localDateTime : "+localDateTime);

        //to retrive time from time and date
        System.out.println("localDateTime : "+localDateTime.toLocalTime());

        //To display the current date
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate : "+localDate);

        //To display the current time (hour, minute, second, and nanoseconds)
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime : "+localTime);
    }

    static void formateDateTime(LocalDateTime localDateTime){
        System.out.println("Before timeDate : "+localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        System.out.println("Before timeDate : "+localDateTime.format(dateTimeFormatter));
  }

    public static String timeConversion(String s) {
        // Write your code here

        DateTimeFormatter dateTimeFormate = DateTimeFormatter.ofPattern("hh:mm:ssa");
        LocalTime localTime =  LocalTime.parse(s,dateTimeFormate);
        if(localTime.equals(LocalTime.MIDNIGHT)){
            System.out.println("");
            return localTime.toString()+":00";
        }
        else {
            return localTime.toString();
        }

    }


    public static void main(String[] args){
        getCurrentDate();
        LocalDateTime localDateTime = LocalDateTime.now();
        formateDateTime(localDateTime);

        timeConversion("12:00:00AM");
    }
}
