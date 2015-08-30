/*******************
Programmer: Dr. Olsen
Purpose: Calculate age of best actress winners
Assignment: In class example
***/

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
public class ActressAge
{
   public static void main(String[] args) throws IOException
   {
      //open file for input reading, and exit if it doesn't exit
      File inputFile = new File ("BestActress.txt"); 
      if(!inputFile.exists())
      {
           JOptionPane.showMessageDialog(null,"Sorry, file doesn't exist. Ending program.");
           System.exit(1); //use because we can't recover from the error
      }

      //read from file
      Scanner scan = new Scanner (inputFile);
      int sum = 0;
      int count = 0;
      
      //read each line, adding the ages to a sum
      while (scan.hasNext())
      {
      	//read in everything on this one line
      	short year = scan.nextShort();
      	String name = scan.next(); //NOT nextLine!
      	String title = scan.next();
      	short age = scan.nextShort();
      	String nationality = scan.next();
      
      	//add age to sum
      	sum += age;  
         count++;   
           
      }
      //find average & output to the user with JOptionPane
      double average = (double) sum / count;
      JOptionPane.showMessageDialog(null,"The average age of best actress winners is " + average);

   }
}