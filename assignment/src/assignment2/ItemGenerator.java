package assignment2;

public class ItemGenerator{
//vars
	private String input;
	private StringBuffer strBuff;
	private String output;
	private int numLetters;
	private int numVowels;
	private int[] positions;

	//constructor
	public ItemGenerator(){
		strBuff=new StringBuffer();
		input="";
		output="";
		numLetters=0;
		numVowels=0;
	}
	//set
	public void setInput(String x){
		input=x;
	}
	//compute
	public void generateNewString(){
		strBuff.append(input.charAt(input.length()-2));
		output=strBuff.toString();
		}
	public void count(){
		for(int i=0;i<input.length();i++){
			numLetters++;
		}
	}
	public void replaceVowels(){
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='A'){
					strBuff.append('a');
					numVowels++;
                }
				else if(input.charAt(i)=='E'){
					strBuff.append('e');
					numVowels++;
                }
				else if(input.charAt(i)=='I'){
					strBuff.append('i');
					numVowels++;
                }
				else if(input.charAt(i)=='O'){
					strBuff.append('o');
					numVowels++;
				}
				else if(input.charAt(i)=='U'){
					strBuff.append('u');
					numVowels++;
				}
				else if(input.charAt(i)==' '){
					strBuff.append(numLetters);
					strBuff.append('-');
				}
			else{
				strBuff.append(input.charAt(i));
			}
		}

		output=strBuff.toString();
	}
	public void countv(){
			strBuff.append(numVowels);
			output=strBuff.toString();
			}
	
	public void reset()
	{
		strBuff.delete(0, strBuff.length());
		input="";
		output="";
		numLetters=0;
		numVowels=0;
	}

	//get
	public String getOutput(){
		return output;
	}
	
	//Q2
		//vars

		private String[] paragraphs;
		private int[] numV;

		//method

		public int[] computeV(String[] paragraphs){

		//set

		this.paragraphs=paragraphs;
		numV=new int [paragraphs.length];
		for(int i=0;i<paragraphs.length;i++){

		//create var count
		int vowelCounter=0;
		//create temp string to check vowel in each paragraph
		String temp=paragraphs[i];
		//once vowel is identified it is added
		for(int j=0;j<temp.length();j++){
			if(temp.charAt(j)=='a'||temp.charAt(j)=='e'||temp.charAt(j)=='i'||temp.charAt(j)=='o'||temp.charAt(j)=='u'||temp.charAt(j)=='A'||temp.charAt(j)=='E'||temp.charAt(j)=='I'||temp.charAt(j)=='O'||temp.charAt(j)=='U'){
			vowelCounter++;
			}
		}
		//numV array is updated with the vowel count from each paragraph
		numV[i]=vowelCounter;
		}
		return numV;
	}
}