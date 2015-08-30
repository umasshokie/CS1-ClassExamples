import java.util.Random;
import java.io.*;
public class testRandom
{
   public static void main(String[] args) throws IOException
   {
      //variables for random generation and looping
      Random rand = //** COMPLETE to create a random number generator
      final int MAX = 1000; //number of random numbers to create
      int count = 0; //start counting at zero
      
      //variables for writing to a file
      //** COMPLETE so that you can write to a file
      
      //Tell the user what is happening
      System.out.print("This program will output " + MAX + " random numbers to a file");
      
      //write the given number of random numbers to the file
      while( //**COMPLETE SO THAT IT LOOPS MAX TIMES
      {
         int number = //** COMPLETE to generate a random number in the correct range
         writer.print(number + ",");
         count++;
      }
      
      //close file because we are done writing
      writer.close();
   }
}