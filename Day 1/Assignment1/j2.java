import java.util.*;

//..............Checking if the number is armstrong.................
public class j2{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num;
	int	n,a,c=0;
	System.out.print("Enter the number: ");
	num = sc.nextInt();
	n= num;
	while(n!=0)
	{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
	}
	if(c==num)
	{
	System.out.println(num+" is Armstrong number");
	}
	else
	{
		System.out.println(num+" is not Armstrong number");
	}
}
}