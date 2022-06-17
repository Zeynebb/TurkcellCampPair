package oopWorkshop2;

public class StudentManager {
	public void add(Student student) {
		System.out.println("Ogrenci eklendi. "+student.getName());
	}
	public void delete(Student student) {
		System.out.println("Ogrenci silindi. "+student.getName());
	}
	public void update(Student student) {
		System.out.println("Ogrenci guncellendi. "+student.getName());
	}
}
