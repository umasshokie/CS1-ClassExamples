import java.util.Scanner;
import java.io.*;
public class ProcessOlympicCountries
{
	public static int processFile(Scanner inputFile, OlympicCountry[] countries) throws IOException
	{
		int count=0;
		while (inputFile.hasNext())
		{
			//Declare Variables
		   int gold = 0;
			int silver = 0;
			int bronze = 0;  
			  
		   //Read the line from the file, add each value to a sum 
		   String country = inputFile.next();
			for(int i=1; i<=4;i++)
			{
					//Sum of gold, silver and bronze medals
					gold   += inputFile.nextInt();
					silver += inputFile.nextInt();
					bronze += inputFile.nextInt();
			}

			OlympicCountry oc = new OlympicCountry(country, gold, silver, bronze);
			countries[count] = oc;
			count++;
		}
		return count;
	}

	public static void outputPoints(OlympicCountry[] array, int num)
	{
		for(int i=0; i<num; i++)
		{
			int p = array[i].calculatePoints();
			System.out.println(array[i].getName() + " has " + p + " points.");
		}
	}


}