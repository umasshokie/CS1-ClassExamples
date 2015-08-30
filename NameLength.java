/**********
Purpose: An example set of methods to call
Author: Dr. Olsen
Course: CS201
**/

import javax.swing.*;

public class NameLength
{
	public static void main(String[ ] args)
	{	
		announce();
		
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		System.out.println("Your name has length " + name.length());
	}
	
	public static void announce( )
	{
		JOptionPane.showMessageDialog(null, 
			"This program will determine the length of your name");
	}
}