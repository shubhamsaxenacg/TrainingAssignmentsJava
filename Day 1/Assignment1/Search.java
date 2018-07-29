import java.util.*;

//.............Search the given number from an array...

public class Search{
	public static void main(String args[])
	{
		int size, number; 
		int array[]= new int[15];
		Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<15; i++)
		{
			array[i]= sc.nextInt();
		}
		
		System.out.print("Enter the number to search: ");
		number= sc.nextInt();
		
		for(int i=0; i<15; i++)
		{
			if(array[i]==number)
			{
				System.out.print("Number found at position "+(i+1));
			}
		}
		
	}
}




