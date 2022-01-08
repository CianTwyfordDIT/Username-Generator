package assignment;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args)
	{
		//declare vars
		String initialString;
		String username;

		//declare objects
		ItemGenerator itemGenerator = new ItemGenerator();

		//input
		initialString = JOptionPane.showInputDialog(null, "Please enter you full name");

		//set
		itemGenerator.setInput(initialString);

		//compute
		itemGenerator.penultimateLetter();
		itemGenerator.replaceVowels();
		itemGenerator.spaceReplace();
		itemGenerator.vowelCount();

		//get
		username = itemGenerator.getOutput();

		//output
		System.out.println("Your generated username is " + username);
	}
}
