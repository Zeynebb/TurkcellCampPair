package oopWorkshop1;

public class Main {

	public static void main(String[] args) {
		// Creating Tutor objects
		Tutor tutor1 = new Tutor(1, "Engin Demirog", "image.jpg");
		Tutor tutor2 = new Tutor(2, "Mustafa Murat Coskun", "image.jpg");
		// Creating Lesson objects
		Lesson lesson1 = new Lesson(1, "Yazilim Gelistirici Yetistirme Kampi (C# ANGULAR)",
				new String[] { "img1", "img2" }, 52);
		Lesson lesson2 = new Lesson(2, "Yazilim Gelistirici Yetistirme Kampi (Java+REACT)",
				new String[] { "img1", "img2" }, 80);
		Lesson lesson3 = new Lesson(3, "Yazilim Gelistirici Yetistirme Kampi (Javascript)",
				new String[] { "img1", "img2" }, 8);
		Lesson lesson4 = new Lesson(4, "Programlamaya Giriþ için Temel Kurs", new String[] { "img1", "img2" }, 67);
		// Creating Category objects
		Category category1 = new Category(1, "Programlama");

		Lesson[] lessonsEnginDemirog = { lesson1, lesson2, lesson3 };
		Lesson[] lessonsBurakKaleci = { lesson3, lesson4 };
		
		lesson1.setCategory(category1);
		lesson2.setCategory(category1);
		lesson3.setCategory(category1);
		lesson4.setCategory(category1);
		
		tutor1.setLessons(lessonsEnginDemirog);
		tutor2.setLessons(lessonsBurakKaleci);
		
		lesson1.setTutors(new Tutor[] { tutor1 });
		lesson2.setTutors(new Tutor[] { tutor1 });
		lesson3.setTutors(new Tutor[] { tutor1, tutor2 });
		lesson4.setTutors(new Tutor[] { tutor2 });
		
		Lesson[] lessonsAll = { lesson1, lesson2, lesson3, lesson4 };
		category1.setLessons(lessonsAll);
		
		for (Lesson lesson : lessonsAll) {
			System.out.println(lesson.getName());
			for (Tutor tutorLesson : lesson.getTutors()) {
				System.out.println("Egitmen: " +tutorLesson.getName());
			}
			System.out.println("%"+lesson.getWatchedPersentage() +" tamamlandi.");
			System.out.println("----------------------------------------------------------");
		}

	}

}
