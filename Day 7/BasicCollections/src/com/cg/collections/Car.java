package com.cg.collections;

public class Car implements Comparable<Car> {
	String make;
	String model;
	String year;
	String price;

	public Car(String make, String model, String year, String price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}


	@Override
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		return (make.compareTo(car.make));
	}
}
