package oopWorkshop3;

public class Credit {

	private int id;
	private String name;
	private int minCredit;
	private int maxCredit;

	public Credit() {
		super();
	}

	public Credit(int id, String name, int minCredit, int maxCredit) {
		super();
		this.id = id;
		this.name = name;
		this.minCredit = minCredit;
		this.maxCredit = maxCredit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinCredit() {
		return minCredit;
	}

	public void setMinCredit(int minCredit) {
		this.minCredit = minCredit;
	}

	public int getMaxCredit() {
		return maxCredit;
	}

	public void setMaxCredit(int maxCredit) {
		this.maxCredit = maxCredit;
	}

}
