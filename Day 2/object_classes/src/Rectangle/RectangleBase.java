package Rectangle;

import java.util.Scanner;

public class RectangleBase {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length and Breadth.....");
		int length = scanner.nextInt();
		int breadth = scanner.nextInt();
		
		Rectangle rectangle = new Rectangle(length, breadth);
		
	//.....AREA
		int area = rectangle.area();
		System.out.println("Area of Rectangle is..."+area);
		
	//....COMPARE
		compareRectangle(rectangle);
		
		scanner.close();
	}
	
	
//........COMPARE FUNCTION..........
	private static void compareRectangle(Rectangle rectangle) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length and Breadth for second rectangle.....");
		int length = scanner.nextInt();
		int breadth = scanner.nextInt();
		
		Rectangle rectangleCompare = new Rectangle(length, breadth);
		
		boolean equal = rectangle.compare(rectangleCompare);
		if(equal)
		{
			System.out.println(".....Area is Equal...");
		}
		else 
			System.out.println(".....Area is Not Equal...");
		scanner.close();
	}
}
