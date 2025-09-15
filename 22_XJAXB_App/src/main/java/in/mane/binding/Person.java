package in.mane.binding;

import javax.xml.bind.annotation.XmlRootElement;

// TO map the simple to the xml
@XmlRootElement
public class Person {
	
	private Integer id;
	private String name;
	private String gender;
	private String email;
	private Address addr;
	//
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	//
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", addr=" + addr
				+ "]";
	}


}
