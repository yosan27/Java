package bangunDatar;

public class BangunDatar implements Draw, Karakteristik{
	private String nama;
	private String sisi;
	private String luas;
	private String keliling;
	
	public BangunDatar(String nama, String sisi, String luas, String keliling) {
		this.luas = luas;
		this.keliling = keliling;
		this.nama = nama;
		this.sisi = sisi;
		
		System.out.println(this.nama);
		System.out.println("-------------------------------------");
		this.jumlahSisi();
		this.rumus();
		this.draw();
		
		System.out.println();
		System.out.println("=====================================");
		System.out.println();
	}

	@Override
	public void rumus() {
		System.out.println("Rumus Luas : " + this.luas);
		System.out.println("Rumus Keliling : " + this.keliling);
		
	}

	@Override
	public void jumlahSisi() {
		System.out.println("Jumlah Sisi : " + this.sisi);
		
	}

	@Override
	public void draw() {
		System.out.println("Menggambar " + this.nama);
		
	}

}
