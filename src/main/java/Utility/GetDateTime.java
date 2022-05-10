package Utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetDateTime {
	public static String datetimes()
	{
		
		 LocalDateTime date =  LocalDateTime.now();
		 // Create object of SimpleDateFormat class and decide the format
		// DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		 DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-a");
		 
		 //get current date time with Date()
		// Date date = new Date();
		 
		 // Now format the date
		 String date1= date.format(dateFormat);
		 
		 // Print the Date
		// System.out.println("Current date and time is " +date1);
		 return date1; 
		 
	 }

}
