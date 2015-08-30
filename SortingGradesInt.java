/*****
 * Author: Dr. Olsen
 * Class: CS201 
 * Purpose: Practice using and creating arrays with sorting and methods
 */

import java.util.Scanner;

public class SortingGradesInt
{
	public static void main(String[] args)
	{
		
		Scanner myScan = new Scanner(System.in); //for user input
      System.out.print("How many grades would you like to enter?");
      final int NUM = myScan.nextInt(); //number of grades to input
		int [] grades = new int[NUM]; //initialize the array to hold the grades
		
		//** call the method to read in values to store in the array
		readInValues(grades, myScan);
		//** call the mtehod to show the values before they are sorted
      outputValues(grades);
      //** call the method to sort the array from SorterInt class
      
      //** call the method to output the values after they are sorted
		outputValues(grades);
	}
   
   /****************
    * Purpose: To read in values from the user and store them in an array
    * Parameters: the array, a Scanner
    * Return: none
    * Algorithm: For every location in the array, input and store a value
    */
   public static void readInValues(int[] array, Scanner scan)
   {
      for(int i=0; i<array.length; i++)
      {
         System.out.print("Enter the value to put the array: ");
         array[i] = scan.nextDouble();
      }
   }
   
   /****************
    * Purpose: To output all values in an array
    * Parameters: the array
    * Return: none
    * Algorithm: For every location in the array, output the value stored there
    */
   public static void outputValues(int[] array)
   {
      for(int i=0; i<array.length; i++)
      {
         System.out.println(array[i]);
      }
   }
}