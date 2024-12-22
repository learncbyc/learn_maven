package com.learncbyc.learnmaven;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.apache.commons.lang3.StringUtils;
import com.learncbyc.learnmaven.HelloState;
import com.learncbyc.learnmaven.HelloCity;

public class HelloWorld {
    public static void main(String[] args) {
        // Use Joda-Time to get the current date
        LocalDate currentDate = LocalDate.now();
        
        // Define the date format using Joda-Time
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MMMM dd, yyyy");
        
        // Format the date using Joda-Time
        String formattedDate = currentDate.toString(formatter);
        
        // Example of string manipulation: Capitalize all letters using StringUtils.upperCase
        String message = "Hello World!";
        String capitalizedMessage = StringUtils.upperCase(message);

        // Print the message with the formatted date
        System.out.println(capitalizedMessage + "  on : " + formattedDate);



        // Create instances of HelloState and HelloCity
        HelloState helloState = new HelloState();
        HelloCity helloCity = new HelloCity();

        // Call their respective methods
        helloState.displayState();
        helloCity.displayCity();
    }
}
