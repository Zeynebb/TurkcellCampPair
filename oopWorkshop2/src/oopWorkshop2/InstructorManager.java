package oopWorkshop2;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("Egitmen eklendi. "+instructor.getName());
	}
	public void delete(Instructor instructor) {
		System.out.println("Egitmen silindi. "+instructor.getName());
	}
	public void update(Instructor instructor) {
		System.out.println("Egitmen güncellendi. "+instructor.getName());
	}
}
