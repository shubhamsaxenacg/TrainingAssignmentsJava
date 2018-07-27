package com.cg.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) {
		
	//......Arraylist for laptop	
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("HP","2.0","windows 10", "I3"));
		laptop.add(new Laptop("dell","3.0","windows 15", "I3"));
		laptop.add(new Laptop("HP","1.0","windows 7", "I2"));
		
		laptop.stream().forEach((lapp) -> System.out.println(lapp)); //.....Printing the list
	
		
	//......Arraylist for Car
		System.out.println("");
		ArrayList<Car> car = new ArrayList<Car>();
		car.add(new Car("m","Maruti","2018","1_000_000"));
		car.add(new Car("ms","Alto","2008","1_300_000"));
		car.add(new Car("chevrolet","Impala","2010","9_000_000"));
		
		laptop.stream().forEach((lapp) -> System.out.println(lapp)); //.....Printing the list
	
		
	//......Arraylist for Television
		System.out.println("");
		ArrayList<Television> television = new ArrayList<Television>();
		television.add(new Television("LG","LCD",true, 10_000));
		television.add(new Television("Croma","LED",false, 35_000));
		television.add(new Television("Samsung","Plasma",true, 40_000));
		
		television.stream().forEach((tel) -> System.out.println(tel)); //.....Printing the list
	
		
	//......Arraylist for CellPhone
		System.out.println("");
		ArrayList<CellPhone> cellPhone = new ArrayList<CellPhone>();
		cellPhone.add(new CellPhone("MI","note4","MI phone ","kitkat", 13_000));
		cellPhone.add(new CellPhone("onePlus","5T","one plus phone ","kitkat", 35_000));
		cellPhone.add(new CellPhone("micromax","canvas","micromax phone","kitkat", 10_000));
		
		cellPhone.stream().forEach((cp) -> System.out.println(cp)); //.....Printing the list
		
	//......Arraylist for School
		System.out.println("");
		ArrayList<School> school = new ArrayList<School>();
		school.add(new School("amity","delhi","delhi",3));
		school.add(new School("symbiosis","up","g2", 2));
		school.add(new School("CG","Mumbai","airoli", 1));
		
		school.stream().forEach((sc) -> System.out.println(sc)); //.....Printing the list
		
		
//.....Set doesn't accept duplicate values	
		Set<Laptop>laptop1 = new HashSet<>();
		System.out.println("");
		laptop1.add(new Laptop("HP","2.0","windows 10", "I3"));
		laptop1.add(new Laptop("HP","2.0","windows 10", "I3"));
		laptop1.add(new Laptop("dell","2.6","windows 8", "I1"));
		
		laptop1.stream().forEach((lapt) -> System.out.println(lapt));
		
		
		
	//.... LinkedHash Set
		Set<Student>student = new LinkedHashSet<Student>();
		System.out.println("");
		student.add(new Student(1, "Shubham"));
		student.add(new Student(2, "Ron"));
		student.add(new Student(3, "Dan"));
		
		student.stream().forEach((stu) -> System.out.println(stu));
		
		
		
		Set<Student>student1 = new TreeSet<Student>();
		System.out.println("");
		student1.add(new Student(2, "Shubham"));
		student1.add(new Student(1, "Ron"));
		student1.add(new Student(3, "Dan"));
		
		student1.stream().forEach((stud) -> System.out.println(stud));
		
		
		
		Set<Car>car1 = new TreeSet<Car>();
		System.out.println("");
		car1.add(new Car("m","Maruti","2018","1_000_000"));
		car1.add(new Car("ms","Alto","2008","1_300_000"));
		car1.add(new Car("chevrolet","Impala","2010","9_000_000"));
		
		car1.stream().forEach((ca) -> System.out.println(ca));
	}

}
