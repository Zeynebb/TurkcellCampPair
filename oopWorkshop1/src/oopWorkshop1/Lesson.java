package oopWorkshop1;

public class Lesson {
	private int id;
	private String name;
	private String[] img;
	private int watchedPersentage;

	private Tutor[] tutors;
	private Category category;

	public Lesson(int id, String name, String[] img, int watchedPersentage) {
		this.id = id;
		this.name = name;
		this.img = img;
		this.watchedPersentage = watchedPersentage;
	}

	public Lesson() {
	}

	public Tutor[] getTutors() {
		return tutors;
	}

	public void setTutors(Tutor[] tutors) {
		this.tutors = tutors;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

	public String[] getImg() {
		return img;
	}

	public void setImg(String[] img) {
		this.img = img;
	}

	public int getWatchedPersentage() {
		return watchedPersentage;
	}

	public void setWatchedPersentage(int watchedPersentage) {
		this.watchedPersentage = watchedPersentage;
	}
}
