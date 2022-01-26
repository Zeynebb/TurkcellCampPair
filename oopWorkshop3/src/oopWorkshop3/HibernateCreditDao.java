package oopWorkshop3;

public class HibernateCreditDao implements CreditDao {

	@Override
	public void add(Credit credit) {
		System.out.println("Hibernate ile eklendi: " + credit.getName());

	}

	@Override
	public void update(Credit credit) {
		System.out.println("Hibernate ile guncellendi: " + credit.getName());

	}

	@Override
	public void delete(Credit credit) {
		System.out.println("Hibernate ile silindi: " + credit.getName());

	}

}
