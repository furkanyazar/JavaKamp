package homework1;

public class Main {

	public static void main(String[] args) {

		Educator educator1 = new Educator(1, "Engin", "Demiro�");

		Course course1 = new Course(1, "C# Kamp", "C# yaz�l�m geli�tirici kamp�", 0, educator1);
		Course course2 = new Course(2, "Java Kamp", "Java yaz�l�m geli�tirici kamp�", 0, educator1);

		Course[] courses = { course1, course2 };

		for (Course course : courses) {
			System.out.println(course.name);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);

	}

}
