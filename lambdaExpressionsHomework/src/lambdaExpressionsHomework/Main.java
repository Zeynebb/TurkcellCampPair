package lambdaExpressionsHomework;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> places = new ArrayList<>();
		places.add("Tokat, Niksar");
		places.add("Tokat, Merkez");
		places.add("Ankara, Balgat");
		places.add("Ankara, Mamak");
		places.add("Istanbul, Besiktas");
		places.add("Tokat, Niksar");

		StreamTest streamTest = (cityName) -> {
			System.out.println(cityName + " ilinin ilceleri: ");
			places.stream().filter((p) -> p.startsWith(cityName)).map((p) -> p.toUpperCase()).sorted()
					.forEach((p) -> System.out.println(p));
		};
		StreamTest streamTest2 = (cityName) -> {
			System.out.println(cityName + " ilinin ilceleri: ");
			places.stream().filter((p) -> p.startsWith(cityName)).map((p) -> "Il-Ilce: " + p).sorted().distinct()
					.forEach((p) -> System.out.println(p));
		};
		streamTest.getPlaces("Tokat");
		System.out.println("------------------------");
		streamTest2.getPlaces("Tokat");

	}

	private static void streamLambdaMethod() {
		List<String> places = new ArrayList<>();
		StreamTest streamTest = (cityName) -> {
			places.add("Tokat, Niksar");
			places.add("Tokat, Merkez");
			places.add("Ankara, Balgat");
			places.add("Ankara, Mamak");
			places.add("Istanbul, Besiktas");
			System.out.println(cityName + " ilinin ilceleri: ");
			places.stream().filter((p) -> p.startsWith(cityName)).map((p) -> p.toUpperCase()).sorted()
					.forEach((p) -> System.out.println(p));
		};
		streamTest.getPlaces("Tokat");
	}

	private static void blockBodyMethod() {
		LambdaTest lambdaTest = () -> {
			int price = 250;
			int doublePrice = price * 2;
			return doublePrice;
		};
	}

	private static void withoutParamaterMethod() {
		WithoutParamater withoutParamater = () -> {
			return 8563;
		};
		System.out.println("Minimum Deger: " + withoutParamater.getMinValue());
	}

	private static void withParamaterMethod() {
		WithParamater withParamater = (name, age, email) -> System.out
				.println("Kullanici Bilgileri: \n" + " Ad: " + name + "\n Yas: " + age + "\n E-Posta Adresi: " + email);
		withParamater.getUser("Zeyneb Eda", 23, "zeynebedayilmaz@hotmail.com");
	}
}