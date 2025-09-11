package in.mane;

public class PetrolEngine implements  IEngine{

	//Overriding the start() of IEngine interface
	@Override
	public int start() {
		System.out.println("Petrol Engine started..");
		return 1;
	}
}
