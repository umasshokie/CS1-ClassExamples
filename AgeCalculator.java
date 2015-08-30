/******************************
Author: Dr. Olsen
Purpose: Practice user input in class
Date: For use in 1/23 class meeting
******************************/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class AgeCalculator
{
	public static void main(String[] args)
	{
      byte age; //will hold age input by user
		String name = "Sally"; //the user's name
      
      //User gives the age

		
		//user gives the name (ignore this for now)

      // calculation for number of months alive
      final byte MONTHS_PER_YEAR = 12;
      int months_alive = age * MONTHS_PER_YEAR; 

      //Output with age in years and months
      System.out.println(name + ", if you are " + age + 
            "years old, you've been alive for " + 
            months_alive + " months");
	}
}
