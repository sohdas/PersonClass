
public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	
	public Address() {
		streetAddress = "1234 Boom Street";
		city = "Hong Kong";
		state = "New York";
		zipCode = 12345;
	}
	
	public String mailingLabel() {
		String label = streetAddress + "\n" + city + ", " + state + ", " + zipCode;
		return label;
	}
}
