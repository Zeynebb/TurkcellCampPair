package oopWorkshop1;

public class Tutor {
	private int id;
	private String name;
	private String img;

	private Lesson[] lessons;

	public Tutor(int id, String name, String img) {
		this.id = id;
		this.name = name;
		this.img = img;
	}

	public Tutor() {
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

	public Lesson[] getLessons() {
		return lessons;
	}

	public void setLessons(Lesson[] lessons) {
		this.lessons = lessons;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
