/*
 * Multiple constructors java example
 */
class Car {
	String name;
	double price;

	// Constructor with 1 parameter
	public Car(String name) {
		this.name = name;
		System.out.println("1 parameters constructor is called");
		System.out.println("Car name :" + this.name);
	}

	// Constructor with 2 parameters
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
		System.out.println("2 parameters constructor is called");
		System.out.println("Car name :" + this.name + ", price:" + this.price);
	}

	// method
	void run() {
		System.out.println(name + " Car is running...");
	}
}

public class Sample_Multi {

	public static void main(String[] args) {

		// Create object with 1 parameter Car(String name)
		// constructor will be called automatically.
		Car maruti = new Car("Maruti");
		maruti.run();

		Car honda = new Car("honda");
		honda.run();

		// Test 2 parameters constructor
		Car marutiWithPrice = new Car("Maruti", 400000.00);
		marutiWithPrice.run();

		Car hondaWithPrice = new Car("honda", 700000.00);
		hondaWithPrice.run();

	}

}

 