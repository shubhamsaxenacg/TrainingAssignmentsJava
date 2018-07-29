import java.util.*;

//............Validation of the username and password...........
public class LoginValidate{
	public static void main(String args[])
	{	
		String savedUserName = "Shubham";
		String savedPassword = "12345678";
		int counter=0;
		Scanner sc = new Scanner(System.in);
		boolean checkEqualUser;
		boolean checkEqualPassword;
		while(counter<3)
		{
		//..........Inputs the username and password
			System.out.print("Username: ");
			String user= sc.next();
			
			System.out.print("Password: ");
			String password= sc.next();
		//...........Checks using equals function
			checkEqualUser = user.equals(savedUserName);
			checkEqualPassword = password.equals(savedPassword);
		
		
			if(checkEqualPassword && checkEqualUser)
			{
				System.out.println("Welcome"+user);
				break;
			}
			else
			{
				counter++;
			}
		}
		if(counter>3)
		{
			System.out.println("Contact Admin");

		}
		
	}
}