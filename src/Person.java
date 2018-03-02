import java.util.ArrayList;
public class Person {
	
	private String name;
	private int salary;
	
	private Address address;
	private Occupation occupation;
	private Projects projects;
	private Schedule schedule;
	private InterestingFacts facts;
	
	public Person() {
		salary = 5;
		name = "Soham Dasgupta";
		address = new Address();
		occupation = new Occupation();
		projects = new Projects();
		schedule = new Schedule();
		facts = new InterestingFacts();
	}	
	
	public void moreMoney() {
		salary += 1000;
	}

	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	public String mailingLabel() {
		return name + "\n" + address.mailingLabel();
	}
	
	public String nameTag() {
		return occupation.nameTag();
	}
	
	public String projectSummary() {
		return projects.projectSummary();
	}
	
	public String mySchedule() {
		return schedule.mySchedule();
	}
	
	public String aboutMe() {
		return facts.aboutMe();
	}
}
