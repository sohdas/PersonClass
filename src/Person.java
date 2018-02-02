
public class Person {
	private String name;
	private int salary;
	private String address;
	private Schedule meetings;

	public Person() {
		name = "Soham Dasgupta";
		salary = 25000;
		address = "1234 Butter Way, Brookfield, WI, 53045";
		meetings = new Schedule();
	}

	public Schedule getMeetings() {
		return meetings;
	}

	public void moreMoney() {
		salary += 1000;
	}

	public String mailingLabel() {
		return name + "\n" + address.substring(0, address.indexOf(",")) + "\n"
				+ address.substring(address.indexOf(",") + 2);
	}
}
