package in.mane.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

	private String msg;

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	//
	public Greeting() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Greeting(String msg) {
		super();
		this.msg = msg;
	}

	
	
	
}
