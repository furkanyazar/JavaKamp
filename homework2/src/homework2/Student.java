package homework2;

public class Student extends User {
	
	private String studentNumber;
	private Course[] courses;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String studentNumber, Course[] courses) {
		super(id, firstName, lastName);
		this.studentNumber = studentNumber;
		this.courses = courses;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
}
