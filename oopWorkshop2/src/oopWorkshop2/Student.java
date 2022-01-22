package oopWorkshop2;

import java.util.List;

public class Student extends User {
	private List<Course> courses;

	public Student() {
		super();
	}

	public Student(int id, String name, String surname, String email) {
		super(id, name, surname, email);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
}
