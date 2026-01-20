package OOPs;

//Multi-Level Inheritance
class Animal6 {
	String name;

	public Animal6(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " is eating");
		System.out.println("------------------");
	}

	public void sleep() {
		System.out.println("Animal6.sleep()");
	}
}

class DogeshBhai6 extends Animal6 {
	private String color;
	public DogeshBhai6(String name, String color) {
		super(name);
		this.color = color;
	}

	@Override
	public void eat() {
		System.out.println(name + " can eat veg and non-veg both............");
		System.out.println("------------------");
	}
}

class Cow extends Animal6 {
	private int age;
	public Cow(String name, String color, int age) {
		super(name);
		this.age = age;
	}
}

public class OOPS_4_Inheritance {

	public static void main(String[] args) {
		DogeshBhai6 d = new DogeshBhai6("Shimbha", "black");
		d.eat();
		Cow c = new Cow("Jimmy", "black", 10);
		c.eat();
	}
}