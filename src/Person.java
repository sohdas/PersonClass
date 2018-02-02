import java.util.ArrayList;
public class Person {
	
	private String name;
	private int salary;
	private ArrayList<String> projects;
	
	public Person()
	{
		name = "Soham Dasgupta";
		salary = 25000;
		projects = new ArrayList<String>();
		projects.add("Finished the car factory report summary.");
	}
	
	public void moreMoney()
	{
		salary +=1000;
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

}
