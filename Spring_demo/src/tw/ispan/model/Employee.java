package tw.ispan.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean{

	private Integer id;
	
	private String name;
	
	private Integer vacation;
	
	public Employee() {
	}
	

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

//	@PostConstruct
//	public void initail() {
//		vacation = 3;
//	}

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

	public Integer getVacation() {
		return vacation;
	}

	public void setVacation(Integer vacation) {
		this.vacation = vacation;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		
		vacation = 5;
		
	}

}
