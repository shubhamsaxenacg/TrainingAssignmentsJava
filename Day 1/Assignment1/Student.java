import java.util.*;

//contains constructor which takes the input of marks for three students
 class Marks{
	int marksSubject1;
	int marksSubject2;
	int marksSubject3;
	int totalMarks;
	int averageMarks;
	Scanner sc = new Scanner(System.in);

	Marks()
	{
		System.out.print("Enter the marks for subject1");
		marksSubject1= sc.nextInt();
		
		System.out.print("Enter the marks for subject2");
		marksSubject2= sc.nextInt();
		
		System.out.print("Enter the marks for subject3");
		marksSubject3= sc.nextInt();
//........Calculates the total marks and average marks for individual students...
		totalMarks= marksSubject1+marksSubject2+marksSubject3;
		averageMarks= totalMarks/3;
	}
}

public class Student{
	public static void main(String args[])
	{
		int subject1Total,subject2Total,subject3Total;
		int subject1Average,subject2Average,subject3Average;
		
		Marks student1 = new Marks();
		Marks student2 = new Marks();
		Marks student3 = new Marks();
		
		System.out.print("\n Total Marks of Student1 is "+student1.totalMarks);
		System.out.print("\n Average Marks of Student1 is "+student1.averageMarks);
		
		System.out.print("Total Marks of Student1 is "+student2.totalMarks);
		System.out.print("Average Marks of Student1 is "+student2.averageMarks);
		
		System.out.print("Total Marks of Student1 is "+student3.totalMarks);
		System.out.print("Average Marks of Student1 is "+student3.averageMarks);

	//...........Calculating the total marks for individual subjects
		subject1Total= student1.marksSubject1+ student2.marksSubject1+ student3.marksSubject1;
		subject2Total= student1.marksSubject2+ student2.marksSubject2+ student3.marksSubject2;
		subject3Total= student1.marksSubject3+ student2.marksSubject3+ student3.marksSubject3;
	
	//...........Average of individual students........
		subject1Average = subject1Total/3;
		subject2Average = subject2Total/3;
		subject3Average = subject3Total/3;
	
	//........Printing the results.........
		System.out.print("Total of Subject1 is "+subject1Total);
		System.out.print("Total of Subject2 is "+subject2Total);
		System.out.print("Total of Subject3 is "+subject3Total);
		System.out.print("Average of Subject1 is "+subject1Average);
		System.out.print("Average of Subject2 is "+subject2Average);
		System.out.print("Average of Subject3 is "+subject3Average);
		

	}
}