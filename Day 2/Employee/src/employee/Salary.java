package employee;

import java.util.*;

public class Salary {
	

	public static void main(String args[])
	{
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		int id;
		String name;
		double monthlyBasic;
	//.....USER INPUT.........	
		System.out.println("Enter employee ID:  ");
		id = scanner.nextInt();
		employee.setId(id);
		
	//........USER INPUT.........
		System.out.println("Enter name:  ");
		name = scanner.next();
		employee.setName(name);
		
	//......USER INPUT.........	
		System.out.println("Enter monthly Salary:  ");
		monthlyBasic = scanner.nextDouble();
		employee.setMonthlyBasic(monthlyBasic);;

	//.....ANNUAL BASIC CALCULATION...........
		double annualBasic = employee.getAnnualBasic();
		System.out.println("Annual basic Salary: "+annualBasic);
		
	//.....MONTHLY GROSS SALARY..............
		double monthlyGrossSalary = employee.getMonthlyGrossSalary();
		System.out.println("Monthly gross Salary: "+monthlyGrossSalary);
		
	//.....ANNUAL GROSS SALARY.................
		double annualGrossSalary = employee.getAnnualGrossSalary();
		System.out.println("Annual gross Salary: "+annualGrossSalary);
		
	//......MONTHLY DEDUCTION.................
		double monthlyDeduction = employee.getMonthlyDeductions();
		System.out.println("Monthly deduction: "+monthlyDeduction);
		
	//.....MONTHLY TAKE HOME.............
		double monthlyTakeHome = employee.getMonthlyTakeHome();
		System.out.println("Monthly TakeHome: "+monthlyTakeHome);
		
	//.....ANNUAL TAKE HOME.............
			double annualTakeHome = employee.getAnnualTakeHome();
			System.out.println("Annual TakeHome: "+annualTakeHome);	
		
		
		scanner.close();
	}
	

}
