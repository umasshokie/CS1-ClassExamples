/*****
 * Author: Dr. Olsen
 * Class: CS201 
 * Purpose: Practice using and creating arrays with sorting and methods
 */

import java.util.Scanner;

public class SortingGrades
{
	public static void main(String[] args)
	{
		
		Scanner myScan = new Scanner(System.in); //for user input
      System.out.print("How many grades would you like to enter?");
      final int NUM = myScan.nextInt(); //number of grades to input
		double [] grades = new double[NUM]; //initialize the array to hold the grades
		
		//** call the method to read in values to store in the array
		
		//** call the mtehod to show the values before they are sorted
      
      //** call the method to sort the array
      
      //** call the method to output the values after they are sorted
		
	}
   
   /****************
    * Purpose: To read in values from the user and store them in an array
    * Parameters: the array, a Scanner
    * Return: none
    * Algorithm: For every location in the array, input and store a value
    */
   public static void readInValues(double[] array, Scanner scan)
   {
      for(int i=0; i<array.length; i++)
      {
         System.out.print("Enter the value to put the array: ");
         array[i] = scan.nextDouble();
      }
   }
   
   /****************
    * Purpose: To output all values in an array
    * Parameters: the array, a Scanner
    * Return: none
    * Algorithm: For every location in the array, output the value stored there
    */
   public static void outputValues(double[] array, Scanner scan)
   {
   
   }
   
   /****************
    * Purpose: To sort an array of double values
    * Parameters: the array, and the number of values stored in the array
    * Return: none
    * Algorithm: Insertion sort
    */
   public static void insertionSort( double [ ] array, int num)
   {
       double temp;
       for ( int i = 1; i < num; i++ )
       {
            temp = array[i];
            int j = i;
            while ( j != 0 && array[j - 1] > temp )
            {
                 array[j] = array[j - 1];       //shift
                 j--;
             }
             array[j] = temp;   //stuff
        }
   }

}