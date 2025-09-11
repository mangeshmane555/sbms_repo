//Program for loosely coupling 

package in.mane;

public class Main {
	public static void main(String[] args) {
//		Car car = new Car(new DieselEngine()); // Constructor injection	
		
		Car car = new Car(new PetrolEngine());
		car.setEng(new PetrolEngine()); // Setter injection
//		
		car.drive();
	}
}

