package homework2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		Course course2 = new Course();
		Course[] courses = { course1, course2 };
		Course[] courses1 = { course1 };
		Course[] courses2 = { course2 };
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setCourses(courses);
		instructor1.setAbout("Hakkında yazısı");

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Furkan");
		student1.setLastName("Yazar");
		student1.setStudentNumber("FY1");
		student1.setCourses(courses1);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ali");
		student2.setLastName("Veli");
		student2.setStudentNumber("AV2");
		student2.setCourses(courses2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student1);
		studentManager.register(student2);
		
		UserManager userManager = new UserManager();
		userManager.logout(instructor1);
	}

}
