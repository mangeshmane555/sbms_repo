package in.mane.beans;

public class PetrolEngine implements IEngine{
	public PetrolEngine() {
		System.out.println("Petrol Engine Constructor");
	}
	public int start() {
		System.out.println("Petrol Engine Started");
		return 1;
	}
}
