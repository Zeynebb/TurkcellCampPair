package oopWorkshop1;

public class Category {
	private int id;
	private String name;

	private Lesson[] lessons;

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Category() {

	}

	public Lesson[] getLessons() {
		return lessons;
	}

	public void setLessons(Lesson[] lessons) {
		this.lessons = lessons;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
