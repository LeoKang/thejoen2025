package java3.p49;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("1. ----------");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("2. ----------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	private static void animalSound(Dog dog) {
		dog.sound();
	}
	
	private static void animalSound(Cat cat) {
		cat.sound();
	}
}
