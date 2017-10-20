package PersonLab;

public abstract class Person {
	private String birthdate;
	private String familyName;
	private String firstName;
	private String birthplace;
	private int ssn;
	
	public Person(String birthdate, String familyName, String firstName, String birthplace, int ssn)
	{
		this.birthdate = birthdate;
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthplace = birthplace; 
		this.ssn = ssn;
	}
	public abstract String greeting();
	public int calculateAge();
	public String toString();
}
