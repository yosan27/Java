package tugasConstructor;

public class Bird implements Name{
	private String name;
	
	public Bird(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Burung " + this.name;
	}
	
}
