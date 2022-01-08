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
	                }
					else if(input.charAt(i)=='E'){
						strBuff.append('e');
	                }
					else if(input.charAt(i)=='I'){
						strBuff.append('i');
	                }
					else if(input.charAt(i)=='O'){
						strBuff.append('o');
					}
					else if(input.charAt(i)=='U'){
						strBuff.append('u');
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
			strBuff.delete(0,strBuff.length());
			numLetters=0;
			numVowels=0;
		}
		public void countv(){
				for(int j=0;j<input.length();j++){
					if(input.charAt(j)=='A' || input.charAt(j)=='E'  || input.charAt(j)=='I'  || input.charAt(j)=='O'  || input.charAt(j)=='U'){
						numVowels++;
				}
			}
		}

		//get
		public String getOutput(){
			return output;
		}
		public int getNumLetters(){
			return numLetters;
		}
		public int getNumVowels(){
			return numVowels;
		}
	}