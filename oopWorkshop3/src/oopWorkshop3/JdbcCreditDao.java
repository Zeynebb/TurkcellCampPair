package oopWorkshop3;

public class JdbcCreditDao implements CreditDao {

	@Override
	public void add(Credit credit) {
		System.out.println("Jdbc ile eklendi: " + credit.getName());

	}

	@Override
	public void update(Credit credit) {
		System.out.println("Jdbc ile guncellendi: " + credit.getName());

	}

	@Override
	public void delete(Credit credit) {
		System.out.println("Jdbc ile silindi: " + credit.getName());

	}

}
