import java.util.Scanner;
import java.io.*;
public class MainOlympicCountries
{
	public static void main(String[] args) throws IOException
	{
		//Get file name from the user
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter the name of the input file");
		String filename = userinput.next();

		//create File object and scanner for file entry
		File file = new File(filename);
		if(!file.exists())
		{
			System.out.println("File counld not be found");
			System.exit(1);
		}
		Scanner fileinput = new Scanner(file);

		//create an array
		OlympicCountry[] countries = new OlympicCountry[100];

		//have process class read from the file
		int size = ProcessOlympicCountries.processFile(fileinput, countries);

		//Determine the points for every country and output results
		ProcessOlympicCountries.outputPoints(countries, size);
	}
}