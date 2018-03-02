public class TestClass {
	public static void main(String[] args) {
		Person test = new Person();
		System.out.println(test.mailingLabel());
		System.out.println(test.nameTag());
		System.out.println(test.projectSummary());
		System.out.println(test.mySchedule());
		System.out.println(test.aboutMe());
		System.out.println(test.getSalary());
		test.moreMoney();
		System.out.println(test.getSalary());
	}
}
