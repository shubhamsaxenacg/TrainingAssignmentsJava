import java.util.*;

//.............gets and prints the armstrong number between 100 to 999
public class j3
{
	public static void main(String args[])
	{
		for(int k=100; k<=999; k++)
		{
			int n=k;
			int a=0;
			int c=0;
			while(n!=0)
			{
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
			}
			if(c==k)
			{
			System.out.println(k+" is Armstrong number");
			}
			/* else
			{
				System.out.println(k+" is not Armstrong number");
			} */
		}
	}
}