package in.mane.binding;

public class Address {
	
	private String city;
	private String state;
	private String Country;
	
	//
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", Country=" + Country + "]";
	}

	//
}
