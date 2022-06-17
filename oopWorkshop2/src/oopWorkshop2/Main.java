package oopWorkshop2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "engin@demirog.com");
		Student student = new Student(2, "Yasemin", "Gerboga", "abc@gmail.com");
		Course course = new Course(1, "Java");
		Category category = new Category(1, "Yazilim");

		List<Instructor> instructors = new ArrayList<Instructor>();
		instructors.add(instructor);

		List<Course> courses = new ArrayList<Course>();
		courses.add(course);

		course.setCategory(category);
		course.setInstructors(instructors);

		instructor.setCourses(courses);
		student.setCourses(courses);

		User[] users = { instructor, student };
		for (User user : users) {
			System.out.println("Kullanici Adi-Soyadi: " + user.getName() + " " + user.getSurname());
		}
		for (Course studentCourse : student.getCourses()) {
			System.out.println("Ogrencinin kursu: " + studentCourse.getCourseName());
		}
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.add(category);
		
		CourseManager courseManager = new CourseManager();
		courseManager.getAll();
		courseManager.register(student, course);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);

	}

}
