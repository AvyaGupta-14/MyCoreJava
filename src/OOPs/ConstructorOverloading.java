package OOPs;

class ConsOverLoading {

	private int id, salary;
	private String name, gender;

	public ConsOverLoading() {
		System.out.println("ConsOverLoading.ConsOverLoading()");
	}

	public ConsOverLoading(String name) {
		this();
		this.name = name;
		System.out.println("ConsOverLoading.ConsOverLoading(1)");

	}

	public ConsOverLoading(String name, String gender) {
		this(name);
		this.gender = gender;
		System.out.println("ConsOverLoading.ConsOverLoading(2)");

	}

	public ConsOverLoading(String name, String gender, int id) {
		this(name, gender);
		this.id = id;
		System.out.println("ConsOverLoading.ConsOverLoading(3)");

	}
	
	public ConsOverLoading(String name, String gender, int id,int salary) {
		this(name, gender,id);
		this.salary = salary;
		System.out.println("ConsOverLoading.ConsOverLoading(4)");
	}

	public void print() {
		System.out.println("name is: " + name);
		System.out.println("gender is: " + gender);
		System.out.println("Id is: " + id);
		System.out.println("salary is: " + salary);
		System.out.println("----------------------------------");
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {

		
		ConsOverLoading c1 = new ConsOverLoading("Kunal", "Male", 101,90000);
		c1.print();
	}

}