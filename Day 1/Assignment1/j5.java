import java.util.*;

//.......getting the marks of three subjects and calculate pass, promoted or failed
public class j5{
	public static void main(String args[])
	{
		int sum, subject1, subject2, subject3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter subject 1: ");
		subject1= sc.nextInt();
		
		System.out.print("Enter subject 2: ");
		subject2= sc.nextInt();
		
		System.out.print("Enter subject 3: ");
		subject3= sc.nextInt();
		
		
		
		if(subject1>60 && subject2>60 && subject3>60)
		{
			System.out.print("Passed");
		}
		else if(subject1>60 && subject2>60 && subject3<60 || subject1>60 && subject2<60 && subject3>60 || subject1<60 && subject2>60 && subject3>60)
		{
			System.out.print("Promoted");
		}
		else
		{
			System.out.print("Failed");
	
		}
		
	}
}