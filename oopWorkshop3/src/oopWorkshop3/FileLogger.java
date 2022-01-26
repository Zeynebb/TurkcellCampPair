package oopWorkshop3;

public class FileLogger implements LoggerService {

	@Override
	public void log(String creditName, int amount) {
		System.out.println(amount + " tl miktarinda " + creditName + " turunde basvurusu yapildi.(Dosyaya Loglandi)");
	}

}
