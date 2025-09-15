package in.mane.beans;

public class Car {
	// eng will work in byName using autowire
	private IEngine eng;
	
	public void setEng(IEngine eng) {
		System.out.println("setter method called");
		this.eng = eng;
	}
	
	public Car() {
		System.out.println("Car : default constructor");
	}
//	
	public Car(IEngine eng) {
		System.out.println("Car : Param constructor");
		this.eng = eng;
	}

//	Interface reference var can hold implemented class objects as below
	//eng = new PetrolEngine();
	//eng = new DieselEngine();
	

	public void drive() {
		// Accessing implemented class methods
		int status = eng.start();
		if(status >=1) {
			System.out.println("Journey Started..");
		}else {
			System.out.println("Engine Problem");
		}
	}
}
