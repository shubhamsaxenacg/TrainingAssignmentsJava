package classes;
import java.util.*;
class Rectangle{
	Scanner sc = new Scanner(System.in);	
	private int length;
	private int breadth;
	
	private int area;
	private int perimeter;
	
	Rectangle()
	{
		System.out.print("Enter the length of rectangle");
		length = sc.nextInt();
		System.out.print("Enter the length of rectangle");
		breadth = sc.nextInt();
	}
	
	public int areaOfRectangle()
	{
		area= length*breadth;
		return area;
	}
	
	public int perimeterOfRectangle()
	{
		perimeter= 2*(length+breadth);
		return perimeter;
	}
	
}
