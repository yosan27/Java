package tugasConstructor;

public class App {

	public static void main(String[] args) {
		Cat meow = new Cat(4);
		
		System.out.println("Kucing Memiliki " + meow.getLegs() + " Kaki");
		meow.eat("Ikan");
		meow.walk("Berjalan");
		
		System.out.println();
		
		Bird bird = new Bird("Cendrawasih");
		
		System.out.println(bird.getName());
	}
}
