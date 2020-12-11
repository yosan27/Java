package tugasConstructor;

public class Animals {
	private int legs;
	
	public Animals(int legs) {
		this.legs = legs;
	}
	
	public int getLegs() {
		return legs;
	}


	public void eat(String food) {
		System.out.println("Memakan " + food);
	}
	
	public void walk(String movement) {
		System.out.println("Bergerak dengan cara " + movement);
	}
}
