package sdbms;


public class Student {
	private Integer id;
	private String name;
	private Integer age;
	private Double marks;

	public Student(int id, String name, int age, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return"Id:"+id+"\nName:"+name+"\nAge:"+age+"\nMarks:"+marks;
	}

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
}
