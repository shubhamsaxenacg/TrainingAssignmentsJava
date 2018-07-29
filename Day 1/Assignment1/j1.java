import java.util.*;
//............The program gets the no. from the user and prints the square of the number using math function
public class j1{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num;
	
	System.out.print("Enter the number: ");
	num = sc.nextInt();
	
	System.out.println("Square of "+num+" is "+Math.pow(num,2));

}
}