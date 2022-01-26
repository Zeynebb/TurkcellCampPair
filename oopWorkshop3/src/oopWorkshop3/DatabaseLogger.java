package oopWorkshop3;

public class DatabaseLogger implements LoggerService{

	@Override
	public void log(String creditName, int amount) {
		System.out.println(amount + " tl miktarinda " + creditName + " turunde basvurusu yapildi.(Veritabanina Loglandi)");
	}

}
