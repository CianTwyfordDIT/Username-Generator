package assignment2;

import javax.swing.JOptionPane;
public class ItemGeneratorApp{
	public static void main(String[] args){

		//declare vars

		String initialString;
		String secondLetter;
		String vowelReplaceString;
		int letterCount;
		int vowelCount;
		String tryAgain;
		tryAgain="yes";
		String msg="Please enter your full name";

		//declare objects

		ItemGenerator slg;
		slg=new ItemGenerator();
		ItemGenerator rp;
		rp=new ItemGenerator();
		ItemGenerator lc;
		lc=new ItemGenerator();
		ItemGenerator vc;
		vc=new ItemGenerator();

		//input

		while(tryAgain.equalsIgnoreCase("yes")){
		initialString=JOptionPane.showInputDialog(null,"Please enter you full name");

		//set

		slg.setInput(initialString);
		rp.setInput(initialString);
		lc.setInput(initialString);
		vc.setInput(initialString);

		//compute

		slg.generateNewString();
		rp.replaceVowels();
		lc.count();
		vc.countv();

		//get

		secondLetter=slg.getOutput();
		vowelReplaceString=rp.getOutput();
		letterCount=lc.getNumLetters();
		vowelCount=vc.getNumVowels();

		//output

		JOptionPane.showMessageDialog(null, "Your generated username is "+secondLetter +vowelReplaceString +letterCount +vowelCount);

		//generate another username
		tryAgain=JOptionPane.showInputDialog(null,"Would you like to generate another username? Please type in Yes or No");
		}
	}
}
