package oopWorkshop2;

public class CourseManager {
	public void getAll() {
		System.out.println("Kurslar listelendi.");
	}

	public void register(Student student, Course course) {
		System.out.println(student.getName() + " adli ogrenci " + course.getCourseName() + " kursuna eklendi.");
	}
}
