package com.cg.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CollectionObject {
	
	 public static void main(String args[])
	 {
		 Scanner scanner = new Scanner(System.in);
		 SavingAccount saving[] = new SavingAccount[5];
		 for(int i=0; i<5; i++)
		 {
			 saving[i] = new SavingAccount();
			 
			 System.out.println("Enter id: ");
			 int id = scanner.nextInt();
			 saving[i].setAcc_id(id);
			 
			 System.out.println("Enter account balance: ");
			 int balance = scanner.nextInt();
			 saving[i].setAcc_balance(balance);
			 
			 System.out.println("Enter account holder name: ");
			 String name = scanner.next();
			 saving[i].setAccountHolderName(name);
			 
			 System.out.println("Enter true if salary account: ");
			 String salary = scanner.next();
			 saving[i].setSalaryAccount(salary);
			 
		 }
		 
		 
		 ArrayList<SavingAccount> savingAcc = new ArrayList<SavingAccount>(Arrays.asList(saving));
		 savingAcc.stream().forEach((sa) -> System.out.println(sa));
		 scanner.close();
	 }
 
}
