package question3;

public class CheckDemo {
	
	public static void main(String args[])
	{
		Check check = new Check();
		
		int a = check.defaultVariable; //Can be accesed in same class and package and subclass in same package
		int b = check.protectedVariable; //Can be accesed in same class, package and subclasses( in same package) and subclass( in different package)
		int c = check.publicVariable; // can be accesed by everyone
	//	ind d = check.privateVariable; // cannot be accessed by another class in same package ....Error
		
		check.disp();//....prints all the values as the function is defined in the class where all the variables are defined
		
	// to get private function we need to access it indirectly by calling function
		int e = check.getPrivate(); // Indirectly accesing the private variable
	}
}
