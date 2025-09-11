package in.mane;

public class DieselEngine implements IEngine {
	
	//Overriding the start() of IEngine interface
	@Override
	public int start() {
		System.out.println("Diesel Engine started..");
		return 1;
	}

}
