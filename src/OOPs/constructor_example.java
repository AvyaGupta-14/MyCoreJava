package OOPs;

class Person {

	private String name, gender;
	private int age;

//	No-arg constructor
	public Person() {
		System.out.println("Person.Person(0)");
	}

//	Parameterized constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Person.Person(3)");
	}

	public void print() {
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Gender is: " + gender);
		System.out.println();
	}

}

public class constructor_example {

	public static void main(String[] args) {

		Person ansh = new Person("Ansh Kumar", 20, "male");
		ansh.print();
		
		Person vikas = new Person("vikas Kumar", 20, "male");
		vikas.print();

		Person anoop = new Person("Anoop", 30, "male");
		anoop.print();

		Person anurag = new Person("Anoop", 30, "male");
		anurag.print();

		Person vinay = new Person("Vinay", 32, "male");
		vinay.print();

		System.out.println("constructor_example.main()");

	}

}



