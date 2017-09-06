package helloworld;

import java.io.Serializable;

@javax.inject.Named
@javax.enterprise.context.RequestScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name; 

	public HelloBean() {
		this.name = "Lou";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
