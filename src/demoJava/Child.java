package demoJava;

import java.util.Scanner;

public class Child extends Parent{
	private double sisiKubus;

	public void setSisiKubus(double sisiKubus) {
		this.sisiKubus = sisiKubus;
	}

	private void volumeKubus() {
		System.out.println("Rumus Volume Kubus = Sisi X Sisi X Sisi");
		System.out.println("Volume Kubus = " + sisiKubus + " X " + sisiKubus + " X " + sisiKubus);
		System.out.println("Volume Kubus = " + Math.pow(sisiKubus, 3));
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		Scanner input = new Scanner (System.in);
		char repeat;
		
		do {
			System.out.println("Menghitung Luas dan Volume");
			System.out.println("1. Luas Segitiga");
			System.out.println("2. Luas Persegi");
			System.out.println("3. Volume Kubus");
			System.out.print("Pilihan (1-3): ");
			
			int pilihan = input.nextInt();
			System.out.println("\n");
			
			switch(pilihan) {
			case 1 :
				System.out.println("Menghitung Luas Segitiga");
				
				System.out.print("Masukkan Besar Alas Segitiga: ");
				double inputAlas = input.nextDouble();
				obj.setAlas(inputAlas);
				
				System.out.print("Masukkan Besar Tinggi Segitiga: ");
				double inputTinggi = input.nextDouble();
				obj.setTinggi(inputTinggi);
				
				obj.luasSegitiga();
				break;
				
			case 2 :
				System.out.println("Menghitung Luas Persegi");
				
				System.out.print("Masukkan Besar Sisi Persegi: ");
				double inputSisi = input.nextDouble();
				obj.setSisi(inputSisi);
				obj.luasPersegi();
				break;
				
			case 3 :
				System.out.println("Menghitung Volume Kubus");
				
				System.out.print("Masukkan Besar Sisi Kubus: ");
				double inputSisiKubus = input.nextDouble();
				obj.setSisiKubus(inputSisiKubus);
				obj.volumeKubus();
				break;
				
			default :
				System.out.println("Pilihan Anda Salah!");
				
			}
			
			System.out.print("\n\nIngin Melanjutkan (y/n)? ");
            repeat = input.next().charAt(0);
            System.out.println("\n");
		}while(repeat == 'y' || repeat == 'Y');
		input.close();
		
	}

}
