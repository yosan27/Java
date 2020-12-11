package demoJava;

public class Parent {
	private double sisi, tinggi, alas;

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public void setAlas(double alas) {
		this.alas = alas;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	public void luasSegitiga() {
		System.out.println("Rumus Luas Segitiga = 0.5 X Alas X Tinggi");
		System.out.println("Luas Segitiga = 0.5 X " + alas + " X " + tinggi);
		System.out.println("Luas Segitiga = " + (0.5*alas*tinggi));
	}
	
	public void luasPersegi() {
		System.out.println("Rumus Luas Persegi = Sisi X Sisi");
		System.out.println("Luas Persegi = " + sisi + " X " + sisi);
		System.out.println("Luas Persegi = " + Math.pow(sisi, 2));
	}

}
