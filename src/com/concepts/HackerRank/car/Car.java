package com.concepts.HackerRank.car;

public abstract class Car {

	boolean isSedan;

	String seats;
	
	
	Car(boolean isSedan, String seats) {
		this.isSedan = isSedan;
		this.seats = seats;
	}

	public boolean getIsSedan() {
		return isSedan;
	}

	public String getSeats() {
		return seats;
	}

	public abstract int getMileage();

	public void printCar(String name) {
		System.out.println("A " + name + " is " + (this.getIsSedan() ? "" : "not ") + "Sedan, is " + this.getSeats()
				+ "-seater, and has a mileage of around " + this.getMileage() + ".");
	}
	 

}

class WagonR extends Car{
	
	int mileage;

	WagonR(int mileage) {
		super(false, "4");
		this.mileage=mileage;
	}

	@Override
	public int getMileage() {
		return mileage;
	}

}

class HondaCity extends Car {

	int mileage;

	HondaCity(int mileage) {
		super(true, "4");
		this.mileage=mileage;

	}

	@Override
	public int getMileage() {
		return mileage;
	}

}

class InnovaCrysta extends Car {

	int mileage;

	InnovaCrysta(int mileage) {
		super(false, "6");
		this.mileage=mileage;
	}
	

	@Override
	public int getMileage() {
		return mileage;
	}

}


