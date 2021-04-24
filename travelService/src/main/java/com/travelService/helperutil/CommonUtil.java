package com.travelService.helperutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CommonUtil {

   public long epochTime(){
       Date today = Calendar.getInstance().getTime();

       // Constructs a SimpleDateFormat using the given pattern
       SimpleDateFormat crunchifyFormat = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");

       // format() formats a Date into a date/time string.
       String currentTime = crunchifyFormat.format(today);
       long epochTime = 0;
       try {

           // parse() parses text from the beginning of the given string to produce a date.
           Date date = crunchifyFormat.parse(currentTime);

           // getTime() returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
            epochTime = date.getTime();

       } catch (ParseException e) {
           e.printStackTrace();
       }

       // Local ZoneID
       ZoneId defaultZoneId = ZoneId.systemDefault();

       Date date = new Date();

       // Default Zone: UTC+0
       Instant instant = date.toInstant();
       System.out.println("instant : " + instant);

       // Local TimeZone
       LocalDateTime localDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
       System.out.println("localDateTime : " + localDateTime);

return epochTime;
   }
}
