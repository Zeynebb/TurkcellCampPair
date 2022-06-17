package oopWorkshop3;

public class CreditManager {

	private CreditDao creditDao;
	private LoggerService[] loggerServices;

	public CreditManager(CreditDao creditDao, LoggerService[] loggerServices) {
		this.creditDao = creditDao;
		this.loggerServices = loggerServices;
	}

	public void apply(Credit credit, int amount) {
		if (credit.getMinCredit() <= amount && credit.getMaxCredit() >= amount) {
			System.out.println(amount + " tl miktarinda kredi basvurusu yapildi.");
			for (LoggerService logger : loggerServices) {
				logger.log(credit.getName(), amount);
			}
		}
		else {
			System.out.println("Kredi basvurusu yapilamadi.");
		}
	}

	public void add(Credit credit) {
		this.creditDao.add(credit);
	}

	public void update(Credit credit) {
		this.creditDao.update(credit);
	}

	public void delete(Credit credit) {
		this.creditDao.delete(credit);
	}

}
