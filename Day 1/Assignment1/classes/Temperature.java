package classes;
import java.util.*;
public class Temperature {
	Scanner sc = new Scanner(System.in);	
	 private double celcius;
	 private double fahrenheit;
	 
	 Temperature()
	 {
		 System.out.print("Enter temperature in celcius");
			celcius = sc.nextInt();
	 }
	 
	 public double convertCelciusToFahrenheit()
	 {
		 fahrenheit= (9.0/5.0)*celcius + 32;
		 return fahrenheit;
	 }
}
