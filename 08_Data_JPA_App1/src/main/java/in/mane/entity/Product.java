package in.mane.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.TableGenerator;

@Entity
public class Product {

	//Note : Dont use primitive datatypes in entity because it stores default values as per datatypes 
	//and Wrapper class datatypes stores datatypes as null 

	@Id
	/* //For Oracle sequence 
	@SequenceGenerator(name="pid", sequenceName = "pid_seq")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pid")*/
	
	//@TableGenerator(initialValue = 100, name = "pid", table = "pid_seq_tbl")
	//@GeneratedValue(strategy = GenerationType.TABLE, generator = "pid")
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	private String productName;
	private Double productPrice;
	//
	public Product() {
		
	}
	//
	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	//
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	

	
	
	
}
