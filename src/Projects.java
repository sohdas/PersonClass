import java.util.ArrayList;

public class Projects {
	private ArrayList<String> completedProjects;
	
	public Projects() {
		completedProjects = new ArrayList<String>();
		completedProjects.add("Wash the Dog.");
		completedProjects.add("Wash the Car.");
		completedProjects.add("Eat food.");
	}
	
	public String projectSummary() {
		String projectList = "";
		for (String x : completedProjects) {
			projectList += x + "\n";
		}
		return projectList;
	}
}
