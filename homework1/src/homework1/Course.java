package homework1;

public class Course {
	
	public Course(int id, String name, String description, double price, Educator educator) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.educator = educator;
	}

	int id;
	String name;
	String description;
	double price;
	Educator educator;

}
