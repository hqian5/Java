package zoo;

public class TestAnimal {
	public static void main(String[] args) {
		Animal[] teAnimals = {
			new Cow(),
			new Pig(),
			new Sheep(),
			new Pig(),
			new Animal() {},
			new Sheep()
		};
		for (Animal i:teAnimals) {
			i.talk();
		}
	}
}
