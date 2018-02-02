
public class Person {
	private String name;
	private int salary;
	private String companyName;
	private String jobTitle;
	
	public Person()
	{
		name = "Soham Dasgupta";
		salary = 25000;
		companyName = "a company";
		jobTitle = "a title";
	}
	
	public void moreMoney()
	{
		salary +=1000;
	}
	public String nameTag() {
		return "Company name: " + companyName + "\nJob title: " + jobTitle;
	}
	

}
