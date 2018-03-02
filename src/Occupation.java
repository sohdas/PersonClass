
public class Occupation {
	private String companyName;
	private String jobTitle;
	
	public Occupation() {
		companyName = "Nintendo";
		jobTitle = "CEO";
	}
	
	public String nameTag() {
		return companyName + "\n" + jobTitle;
	}
}
