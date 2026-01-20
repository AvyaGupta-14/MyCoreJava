package OOPs;

//public class Inheritance {

		class Animal {
			public void wakeUp() {
				System.out.println("Animal.wakeUp()");
			}

			public void hustle() {
				System.out.println("Animal.hustle()");
			}

			public void eat() {
				System.out.println("Animal.eat()");
			}

			public void sleep() {
				System.out.println("Animal.sleep()");
			}
		}

		class DogeshBhai extends Animal {

		}

		class Pilla extends DogeshBhai
		{
			
			public void run()
			{
				System.out.println("Pilla.run()");
			}
			
			
		}

		class Tiger extends Animal
		{
			
		}
		public class Inheritance {

			public static void main(String[] args) {
				System.out.println("---------ANIMAL---------");
				Animal a = new Animal();
				a.wakeUp();
				a.hustle();
				a.eat();
				a.sleep();
				System.out.println("------------------");
				System.out.println("---------DogeshBhai---------");
				DogeshBhai d = new DogeshBhai();
				d.wakeUp();
				d.hustle();
				d.eat();
				d.sleep();
				System.out.println("------------------");
				
				System.out.println("---------PILLA---------");

				Pilla p = new Pilla();
				p.wakeUp();
				p.hustle();
				p.eat();
				p.sleep();
				p.run();
				System.out.println("------------------");
				
				System.out.println("---------TIGER---------");
				Tiger t = new Tiger();
				t.wakeUp();
				t.hustle();
				t.eat();
				t.sleep();
				System.out.println("------------------");
				
			}

		}
//}
