package assignment;

public class ItemGenerator
{
	//vars
	private String input;
	private StringBuffer strBuff;
	private String output;
	private int vowelCount;
	
	//constructor
	public ItemGenerator()
	{
		strBuff = new StringBuffer();
		input = "";
		output = "";
	}
	
	//set
	public void setInput(String x)
	{
		input = x;
	}
	
	//compute
	public void penultimateLetter()
	{
		strBuff.append(input.charAt(input.length() - 2));
		output = strBuff.toString();
	}
	
	//compute
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
				vowelCount++;
			}
			else
			{
				strBuff.append(input.charAt(i));
			}
		}
		output = strBuff.toString();
	}
	
	//compute
	public void spaceReplace()
	{
		//get string character length and add hyphen
		String replacement = String.valueOf(input.length()) + '-';
		
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == ' ')
			{
				strBuff.replace(i + 1, i + 2, replacement);
			}
		}
		
		output = strBuff.toString();
	}
	
	//compute
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