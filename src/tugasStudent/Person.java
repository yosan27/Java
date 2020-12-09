package tugasStudent;

public class Person {
// 	Initialitation Person Variables
	private String fname;
	private String lname;
	private String domicile;
	
// 	Constructor
	public Person(String fname, String lname, String domicile) {
		this.fname = fname;
		this.lname = lname;
		this.domicile = domicile;
	}
	
//	Getter Full Name
	public String getFullName() {
		return this.fname + " " + this.lname;
	}
	
//	Getter Domisili
	public void getDomisili() {
		System.out.println("Domicile\t: " + this.domicile);
	}

}
