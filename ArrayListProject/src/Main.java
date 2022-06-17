import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("add() Fonksiyonu");
		addMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("addAll() Fonksiyonu");
		addAllMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("clear() Fonksiyonu");
		clearMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("clone() Fonksiyonu");
		cloneMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("get() Fonksiyonu");
		getMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("indexOf() Fonksiyonu");
		indexOfMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("remove() Fonksiyonu");
		removeMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("removeAll() Fonksiyonu");
		removeAllMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("set() Fonksiyonu");
		setMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("size() Fonksiyonu");
		sizeMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("subList() Fonksiyonu");
		subListMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("toArray() Fonksiyonu");
		toArrayMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("contains() Fonksiyonu");
		containsMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("isEmpty() Fonksiyonu");
		isEmptyMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("lastIndexOf() Fonksiyonu");
		lastIndexofMethod();
		System.out.println("----------------------------------------------------");
		System.out.println("retainAll() Fonksiyonu");
		retainAllMethod();
		System.out.println("----------------------------------------------------");

	}

	private static void retainAllMethod() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zeyneb");
		names.add("Eda");
		names.add("Yýlmaz");
		names.add("Engin");
		names.add("Demiroð");

		ArrayList<String> firstNames = new ArrayList<String>();
		firstNames.add("Zeyneb");
		firstNames.add("Eda");
		firstNames.add("Engin");

		names.retainAll(firstNames);
		System.out.println(names);
	}

	private static void lastIndexofMethod() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zeyneb");
		names.add("Eda");
		names.add("Yýlmaz");
		names.add("Engin");
		names.add("Demiroð");
		names.add("Zeyneb");
		names.add("Engin");

		System.out.println("Zeyneb: " + names.lastIndexOf("Zeyneb"));
		System.out.println("Engin: " + names.lastIndexOf("Engin"));
	}

	private static void isEmptyMethod() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zeyneb");
		names.add("Eda");
		names.add("Yýlmaz");
		names.add("Engin");
		names.add("Demiroð");
		ArrayList<String> cities = new ArrayList<String>();

		System.out.println("Names listesi: " + names.isEmpty());
		System.out.println("Cities listesi: " + cities.isEmpty());
	}

	private static void containsMethod() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zeyneb");
		names.add("Eda");
		names.add("Yýlmaz");
		names.add("Engin");
		names.add("Demiroð");

		System.out.println(names.contains("Eda"));
	}

	private static void toArrayMethod() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zeyneb");
		names.add("Eda");
		names.add("Yýlmaz");
		names.add("Engin");
		names.add("Demiroð");
		System.out.println("ArrayList: " + names);
		Object[] nameArray = names.toArray();
		for (Object name : nameArray) {
			System.out.println("Array: " + name);
		}
	}

	private static void subListMethod() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Zeyneb");
		names.add("Eda");
		names.add("Yýlmaz");
		names.add("Engin");
		names.add("Demiroð");

		List<String> namesSubList = names.subList(1, 4);
		System.out.println(namesSubList);
	}

	private static void sizeMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(300);
		integerList.add(400);
		integerList.add(500);
		integerList.add(600);

		System.out.println("Liste içerisindeki nesne sayýsý: " + integerList.size());
	}

	private static void setMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(300);
		integerList.add(400);
		integerList.add(500);
		integerList.add(600);

		integerList.set(2, 900);
		System.out.println(integerList);
	}

	private static void removeAllMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(300);
		integerList.add(400);
		integerList.add(500);
		integerList.add(600);
		integerList.add(700);
		integerList.add(800);

		ArrayList<Integer> removeList = new ArrayList<Integer>();
		removeList.add(400);
		removeList.add(500);

		integerList.removeAll(removeList);
		System.out.println(integerList);
	}

	private static void removeMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(300);
		integerList.add(400);
		integerList.add(500);
		integerList.add(600);
		integerList.add(700);
		integerList.add(800);

		integerList.remove(2);
		integerList.remove(integerList.indexOf(700));
		System.out.println("Liste: " + integerList);
	}

	private static void indexOfMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(500);
		integerList.add(600);
		integerList.add(700);
		integerList.add(800);

		System.out.println(integerList.indexOf(800));
		System.out.println(integerList.indexOf(900));
	}

	private static void getMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(500);
		integerList.add(600);
		integerList.add(700);
		integerList.add(800);

		System.out.println("Listenin dördüncü elemaný: " + integerList.get(3));
	}

	private static void cloneMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(500);
		integerList.add(600);
		integerList.add(700);

		ArrayList<Integer> integerListClone = (ArrayList<Integer>) integerList.clone();
		System.out.println(integerListClone);
	}

	private static void addMethod() {

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(500);
		integerList.add(600);
		integerList.add(700);
		integerList.add(800);
		integerList.add(900);

		ArrayList<Double> doubleList = new ArrayList<Double>();
		doubleList.add(500.8);

		ArrayList<Character> characterList = new ArrayList<Character>();
		characterList.add('Z');
		System.out.println(integerList);
	}

	private static void clearMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(500);
		integerList.add(600);
		integerList.add(700);
		integerList.add(800);
		integerList.add(900);

		integerList.clear();
	}

	private static void addAllMethod() {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);

		ArrayList<Integer> integerList2 = new ArrayList<Integer>();
		integerList2.add(50);
		integerList2.add(60);
		integerList2.add(70);

		integerList.addAll(integerList2);

		System.out.println(integerList);
	}

}
