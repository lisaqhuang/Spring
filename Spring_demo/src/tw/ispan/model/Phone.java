package tw.ispan.model;

public class Phone {
	
	private Integer id;
	
	private String phoneName;
	
	private String phoneBrand;
	
	public Phone() {
	}

	public Phone(Integer id, String phoneName, String phoneBrand) {
		super();
		this.id = id;
		this.phoneName = phoneName;
		this.phoneBrand = phoneBrand;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneBrand() {
		return phoneBrand;
	}

	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}

}
