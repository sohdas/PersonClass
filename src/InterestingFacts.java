import java.util.ArrayList;

public class InterestingFacts {
	private ArrayList<String> funFacts;
	
	public InterestingFacts() {
		funFacts = new ArrayList<String>();
		funFacts.add("Can spit 83 feet.");
		funFacts.add("Can split a banana with his will.");
		funFacts.add("Can fit his hand in a jar.");
	}
	
	public String aboutMe() {
		String about = "";
		for (String x : funFacts) {
			about += "1. " + x + "\n";
		}
		return about;
	}
}
