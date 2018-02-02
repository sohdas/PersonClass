
public class Person {
	private String name;
	private int salary;
	private String address;

	public Person() {
		name = "Soham Dasgupta";
		salary = 25000;
		address = "1234 Butter Way, Brookfield, WI, 53045";
	}

	public void moreMoney() {
		salary += 1000;
	}
	
	public String mailingLabel() {
		return name + "\n" + address.substring(0, address.indexOf(",")) + "\n" + address.substring(address.indexOf(",") + 2);
	}

}
