package assignment2;

import javax.swing.JOptionPane;

public class ItemGeneratorApp{
	public static void main(String[] args){

		//declare vars

		String initialString;
		String output;
		String tryAgain;
		tryAgain="yes";
		String msg="Please enter your full name";

		//declare objects

		ItemGenerator slg;
		slg=new ItemGenerator();

		//input

		while(tryAgain.equalsIgnoreCase("yes")){
		initialString=JOptionPane.showInputDialog(null,"Please enter you full name");

		//set

		slg.setInput(initialString);

		//compute

		slg.generateNewString();
		slg.count();
		slg.replaceVowels();
		slg.countv();

		//get

		output=slg.getOutput();
		
		slg.reset();
		
		//output

		JOptionPane.showMessageDialog(null, "Your generated username is "+output);

		//generate another username
		tryAgain=JOptionPane.showInputDialog(null,"Would you like to generate another username? Please type in Yes or No");
		}
		
		//Q2
				//vars

				int numP;
				String[] paragraphs;

				//input - by entering the number of paragraphs (numP) we also get the length of the array

				numP=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter number of paragraphs!"));
				paragraphs=new String[numP];

				//each paragraph entered will be stored in an array

				for(int i=0;i<paragraphs.length;i++){
				paragraphs[i]=JOptionPane.showInputDialog(null, "Please enter your paragraph!");
				}

				//compute

				int[] numV = slg.computeV(paragraphs);

				//output

				for(int i=0;i<paragraphs.length;i++){
				JOptionPane.showMessageDialog(null, "For the following paragraph: " +paragraphs[i]);
				JOptionPane.showMessageDialog(null, "the number of vowels found is: " +numV[i]);
				}
			}
}
