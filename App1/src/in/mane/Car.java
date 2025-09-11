package in.mane;

public class Car 
{
	private IEngine eng; // Car Class is talking to interface IEngine (interface reference i.e eng hold the object of implemented classes)
	//
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	//Created constructor means not creating the object but expecting the object
	public Car(IEngine eng) {
		this.eng = eng;
	}
	//
	public void drive() {
		int start = eng.start(); //NullPointerException
		if(start >= 1) {
			System.out.println("Journey Started");
		}else {
			System.out.println("Engine in Trouble");
		}
	}
}
