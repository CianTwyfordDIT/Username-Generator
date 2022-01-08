package assignment;

public class ItemGenerator
{
	//vars
	private String input;
	private StringBuffer strBuff;
	private String output;
	private int vowelCount; //count number of vowels changing case 
	
	//constructor
	public ItemGenerator()
	{
		strBuff = new StringBuffer();
		input = "";
		output = "";
	}
	
	//set
	public void setInput(String name)
	{
		input = name;
	}
	
	//compute
	//begin username with penultimate letter
	public void penultimateLetter()
	{
		strBuff.append(input.charAt(input.length() - 2));
		output = strBuff.toString();
	}
	
	//compute
	//replace upper case vowels with lower case
	public void replaceVowels()
	{
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == 'A' || input.charAt(i) == 'E' || 
				input.charAt(i) == 'I' || input.charAt(i) == 'O' ||
				input.charAt(i) == 'U')
			{
				String replacement = String.valueOf(input.charAt(i)).toLowerCase();
				strBuff.append(replacement);
				vowelCount++; //keep count of changes
			}
			else
			{
				strBuff.append(input.charAt(i));
			}
		}
		output = strBuff.toString();
	}
	
	//compute
	//replace any space with *number of characters in string* + '-'
	public void spaceReplace()
	{
		//get string character length and add hyphen
		String replacement = String.valueOf(input.length()) + '-';
		
		for(int i = 0; i < strBuff.length(); i++)
		{
			if(strBuff.charAt(i) == ' ')
			{
				strBuff.replace(i, i + 1, replacement);
			}
		}
		
		output = strBuff.toString();
	}
	
	//compute
	//append number of vowel changes to end of username
	public void vowelCount()
	{
		strBuff.append(String.valueOf(vowelCount));
		output = strBuff.toString();
	}

	//get
	public String getOutput()
	{
		return output;
	}
}