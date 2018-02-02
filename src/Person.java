import java.util.ArrayList;
public class Person {
	
	private String name;
	private int salary;
	private String companyName;
	private String jobTitle;
	private ArrayList<String> projects;
	
	public Person()
	{
	private String address;

	public Person() {
		name = "Soham Dasgupta";
		salary = 25000;
		companyName = "a company";
		jobTitle = "a title";
		projects = new ArrayList<String>();
		projects.add("Finished the car factory report summary.");
		address = "1234 Butter Way, Brookfield, WI, 53045";
	}

	public void moreMoney() {
		salary += 1000;
	}
	
	public String mailingLabel() {
		return name + "\n" + address.substring(0, address.indexOf(",")) + "\n" + address.substring(address.indexOf(",") + 2);
	}
	
	public String projectSummary()
	{
		String summ = "Projects List:";
		for(int x = 0; x < projects.size(); x++)
		{
			summ+="\n"+projects.get(x);
		}
		
		return summ;
	}
	public String nameTag() {
		return "Company name: " + companyName + "\nJob title: " + jobTitle;
	}
	

}
