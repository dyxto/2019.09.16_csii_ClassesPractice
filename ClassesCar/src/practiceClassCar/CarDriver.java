package practiceClassCar;

import personClass.Person;

public class CarDriver {
	
	public static void main(String[] args) {
		
		//Class objectname = new Class();
		Car sedan = new Car();
		Car pickup = new Car();
		
		//sedan and pickup is null
		//Constructor now default new Car() as "Honda"
		System.out.println("The sedan is a " + sedan.getMake());
		System.out.println("The pickup is a " + pickup.getMake());
		
		sedan.setMake("Honda");
		pickup.setMake("Chevy");
		
		//not null anymore
		System.out.println("The sedan is a " + sedan.getMake());
		System.out.println("The pickup is a " + pickup.getMake());

		//Testing new Constructor
		System.out.println("Testing the new Car constructor...");
		Car other = new Car("Ford",2006,17, 0, null);
		System.out.println("The other car is a " + other.getMake()
							+ " with " + other.getFuelLevel() + " gallons of gas in the tank.");
		
		//testing drive method
		Car another = new Car("LAMBO",2019,20,50, null);
		another.drive(100);
		System.out.println("The another car is a " + another.getMake() 
							+ " with " + another.getFuelLevel() + " gallons.");
	}

}
