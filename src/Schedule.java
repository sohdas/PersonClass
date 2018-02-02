
public class Schedule {
	private String[] schedule;

	public void Schedule() {
		schedule = new String[5];
		schedule[0] = "John";
		schedule[1] = "Boss";
		schedule[2] = "Employees";
		schedule[3] = "Adam";
		schedule[4] = "Allison";
	}
	
	public String scheduledMeetings() {
		return schedule[0] + "\n" +  schedule[1] + "\n" + schedule[2] + "\n" + schedule[3] + "\n" + schedule[4];
	}
}
