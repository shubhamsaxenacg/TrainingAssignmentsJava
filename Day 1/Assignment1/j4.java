import java.util.*;

//...........Calculation of simple interest and compound interest
public class j4{
	public static void main(String args[])
	{
		double sim,com,pr,t,rate;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount: ");
		pr= sc.nextInt();
		
		System.out.print("Enter the year: ");
		t= sc.nextInt();
		
		System.out.print("Enter the rate: ");
		rate= sc.nextInt();
		
	//.......For Simple interest	
		sim = (pr*t*rate)/100;
	//.......for compound interest
		com = pr * Math.pow(1.0+rate/100.0,t)-pr;
		
		System.out.print("Simple: "+sim);
		System.out.print("Compound: "+com);
	}
}