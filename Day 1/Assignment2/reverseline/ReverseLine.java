package reverseline;
import java.util.Scanner;
public class ReverseLine {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the sentence: ");
		String sentence= sc.nextLine();
		String stringArray[]= sentence.split(" ");
		
		for(int i=0; i< stringArray.length; i++)
		{
			String reverse = new StringBuffer(stringArray[i]).reverse().toString();
			System.out.print(reverse+" ");
		}
	}
}
