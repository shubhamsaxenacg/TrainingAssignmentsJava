package whiteSpace;

public class WhiteSpaceFunction {
	
	private String sentence;
	private String sentenceArray[];
	
	//.............getter function.........
	public String getSentence() {
		return sentence;
	}

	//............Setter function............
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	//........Method to remove function set by setSentence function..........
	public String removeSpace()
	{
		String newSentence = sentence.replaceAll("\\s+", " ");
		return newSentence;
	}
	
	
	//.......Method over-riding to pass argument in the function........................
	public String removeSpace(String sentence)
	{
		String newSentence = sentence.replaceAll("\\s+", " ");
		return newSentence;
	}
	
	
	//........Function to remove word from position in sentence.........
	//........this function is calling another function to remove space.........
	public String removeWord(String word, int position)
	{
		sentence = removeSpace();
		sentenceArray = sentence.split(" ");
		for(int i=0; i<sentenceArray.length; i++)
		{
			
			if(position == i+1 && word.equals(sentenceArray[i]))
			{
				sentenceArray[i]= "";
				
			}
		}
		String string = String.join(" ", sentenceArray);
		string = removeSpace(string);
		return string;		
	}

}

