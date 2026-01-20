package OOPs;

class Vehicle{
	String brand;
	String color;
	
	public Vehicle(String brand, String color){
		this.brand = brand;
		this.color = color;
		System.out.println("Vehicle constructor");
	}
	
	public void display() {
		System.out.println("Brand: " + brand + "Color: " + color);
	}
	
	public void start() {
		System.out.println("Starting the" + brand);
		
	}
	
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
