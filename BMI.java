/* Demonstrating decision making  */
           
import javax.swing.JOptionPane;
                  
public class BMI
{
  public static void main( String [] args )
  {
    	
	   //ask the user for his/her weight		
   	String input = JOptionPane.showInputDialog("Please give your weight in pounds:");
		int weight = Integer.parseInt(input);
	
		//ask the user for his/her height		
   	input = JOptionPane.showInputDialog("Please give your height in inches:");
		int inches = Integer.parseInt(input);
	
		//Calculate BMI using the weight and inches already input by the user ***FINISH***
		double bmi =
			
		// print out the BMI 
		JOptionPane.showMessageDialog(null, "Your BMI is " + bmi);
	
		// print out the correct category--there are 4 ***FINISH***
		if (bmi
			JOptionPane.showMessageDialog(null, "You are obese");
		else if(
			JOptionPane.showMessageDialog(null,"You are ");
		else if(
			JOptionPane.showMessageDialog(null,"You are ");
		else
			JOptionPane.showMessageDialog(
	}

}