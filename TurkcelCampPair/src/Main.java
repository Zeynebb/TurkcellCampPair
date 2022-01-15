import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int sayi1 = 3, sayi2 = 3;
		int sum1 = 0, sum2 = 0;
		while (list.size() < 2) {
			for (int i = 1; i < sayi1; i++) {
				if (sayi1 % i == 0) {
					sum1 = sum1 + i;
				}
				sayi2 = sum1;
				for (int j = 1; j < sum1; j++) {
					if (sayi2 % j == 0) {
						sum2 = sum2 + j;
					}
				}
				if (sum2 == sayi1 && sayi1 != sayi2) {
					list.add(sayi1);
					list.add(sayi2);
					break;
				}
				sum2 = 0;
			}
			sayi1++;
			sum1 = 0;
		}
		for (int sayi : list) {
			System.out.println(sayi);
		}
	}

}
