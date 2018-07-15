package Entity;

public class Car {
	private Long id;
	private String mark;
	private String model;
	private Integer year;
	private String color;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car() {
	}

	public Car(Long id, String mark, String model, Integer year, String color) {
		super();
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	
	
}
