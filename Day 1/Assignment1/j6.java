import java.util.*;

//...........Calculating the tax amount on the basis of income amount

public class j6{
	public static void main(String args[])
	{
		long income,tax;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Income ");
		income= sc.nextInt();
		
				
		if(income<=180000)
		{
			tax = income;
			System.out.print("Tax amount is "+tax);
		}
		else if(income<=300000 && income>180000)
		{
			tax = income*10/100;
			System.out.print("Tax amount is "+tax);
		}
		else if(income<=500000 && income>300000)
		{
			tax = income*20/100;
			System.out.print("Tax amount is "+tax);
		}
		else if(income<=1000000 && income>500000)
		{
			tax = income*30/100;
			System.out.print("Tax amount is "+tax);
		}
		
	}
}