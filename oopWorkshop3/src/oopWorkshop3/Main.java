package oopWorkshop3;

public class Main {

	public static void main(String[] args) {
		Credit credit = new Credit(1, "Tarim Kredisi", 10000, 30000);
		Credit credit2 = new Credit(2, "Ev Kredisi", 100000, 400000);
		
		LoggerService[] loggers = {new DatabaseLogger(), new FileLogger()};

		CreditManager creditManager = new CreditManager(new JdbcCreditDao(), loggers);
		creditManager.add(credit);
		creditManager.update(credit);
		creditManager.delete(credit);
		
		creditManager.apply(credit, 5000);
		creditManager.apply(credit2, 200000);

	}

}
