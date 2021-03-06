package classes;
import java.util.*;
public class Classes {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.print("Choose: \n 1. Rectangle \n 2. Temperature \n 3. Circle  \n 4. Date  \n 5. Calculator  \n 6. Customer  \n 7. Employee");
		option = sc.nextInt();
		
		switch(option)
		{
			case 1:
				int area,perimeter;
				Rectangle rectangle = new Rectangle();
				area = rectangle.areaOfRectangle();
				perimeter = rectangle.perimeterOfRectangle();
				System.out.print("Area is: "+area);
				System.out.print("Perimeter is: "+perimeter);
				break;
				
			case 2:
				double fahrenheit;
				Temperature temperature = new Temperature();
				fahrenheit = temperature.convertCelciusToFahrenheit();
				System.out.print("Temperature in fahrenheit is  "+fahrenheit);
				break;
				
			case 3:
				double areaOfCircle;
				Circle circle = new Circle();
				areaOfCircle = circle.areaOfCircle();
				System.out.print("Area of circle is  "+areaOfCircle);
				break;
				
			case 4:
				Date date = new Date();
				break;
				
			case 5:
				Calculator calculator = new Calculator();
				int sum,subtract,multiply,divide;
				sum = calculator.Sum();
				subtract = calculator.Subtract();
				multiply = calculator.Multiply();
				divide = calculator.Divide();
				System.out.print("Sum is  "+sum);
				System.out.print("Subtract is  "+subtract);
				System.out.print("Multiply is  "+multiply);
				System.out.print("Divide is  "+divide);
				break;
				
			case 6:
				Customer customer = new Customer();
				customer.display();
				break;
				
			case 7:
				Employee employee = new Employee();
				employee.display();
				break;
		}
	}
	
}