package demoJava;
import java.util.Scanner;

public class TutorialJava {
	static Scanner in;
	
	public void draw(int jml) {
		for(int i = 0; i < jml ; i++) {
			for(int j = 0; j < jml ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	
	public static void main(String[] args) {
//		in = new Scanner (System.in);
//		TutorialJava obj = new TutorialJava();
//		System.out.print("Masukkan Jumlah : ");
//		int n = in.nextInt();
//		System.out.println();
//		obj.draw(n);
		
		double x = 5.2;
		System.out.println(x);
	}

	
}
