package practiceClassCar;

import personClass.Person;

public class Car {
	
	private String make;
	private int year;
	private double mpg, fuelLevel;
	
	//constituent object from Person class
	private Person owner;
	
	//Constructor(s)
	//specify initial values for an object's attributes
	//only called when an object is created
	//has no returnType
	//FORMAT:	modifier methodName (parameters)
	//must have same name as class
	public Car () {
		make = "Honda";
		year = 1992;
		mpg = 37;
		fuelLevel = 0;
	}
	
	//overloading Constructor Car
	public Car (String make, int year, double mpg, double fuelLevel, Person owner) {
		this.fuelLevel = fuelLevel;
		this.make = make;
		this.year = year;
		this.mpg = mpg;
		this.owner = new Person(owner);
	}
	
	//other methods
	public void drive (double distance) {
		fuelLevel = fuelLevel - (distance/mpg);
	}
	
	//toString
	public String toString() {
		return year +" "+make; 
	}
	
	//setter for owner (of type Person)
	public void setOwner(Person owner) {
		this.owner = new Person(owner);
		//or this.owner = owner.copy(
	}
	public void setOwner(String first,char midIni,String last) {
		owner.setfirst(first);
		owner.setMidIni(midIni);
		owner.setlast(last);
	}
	
	
	//getters & setters
	//FORMATE:	modifier returnType methodName (parameters)
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFuelLevel() {
		return fuelLevel;
	}
	public void setfuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
}