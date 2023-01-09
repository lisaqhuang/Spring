package tw.ispan.model;

import org.springframework.stereotype.Component;
//相當於
@Component("student")//若沒寫id,預設值為Class 名稱小寫開頭 student
public class Student {

	private Integer id;
	
	private String name;
	
	private String nickName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
