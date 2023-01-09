package tw.ispan.model;

import java.util.Date;

public class Car {

	
	private Integer id;
	private String carname;
	private String brand;
	private Date releaseDate;
	private Date productDate;
	
	public Car() {
	}
	
	public Car(Integer id, String carname, String brand) {
		super();
		this.id = id;
		this.carname = carname;
		this.brand = brand;
	}
		
	public Car(Date releaseDate) {
		super();
		this.releaseDate = releaseDate;
	}
		

	public Car(Date releaseDate, Date productDate) {
		super();
		this.releaseDate = releaseDate;
		this.productDate = productDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	

}
