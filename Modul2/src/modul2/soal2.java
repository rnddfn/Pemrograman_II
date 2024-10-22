package modul2;

class Kopi{
	String namaKopi;
	String ukuran;
	double harga;
	String pembeli;
	double pajak;
	
	void info(){
		System.out.println("Nama Kopi: " + namaKopi);
		System.out.println("Ukran: " + ukuran);
		System.out.println("Harga: " + harga);
	}
	
	void setPembeli(String namaPembeli) {
		pembeli = namaPembeli;
	}
	
	String getPembeli() {
		return pembeli;
	}
	
	double getPajak() {
		pajak = harga * 11/100;
		return pajak;
	}
}

public class soal2 {

	public static void main(String[] args) {
		Kopi kopi1 = new Kopi(); 
        kopi1.namaKopi = "Espresso"; 
        kopi1.ukuran = "Medium"; 
        kopi1.harga = 25000; 
 
        kopi1.info(); 
        kopi1.setPembeli("Alice"); 
        System.out.println("Pembeli Kopi: " + kopi1.getPembeli()); 
        System.out.println("Pajak Kopi: Rp. " + kopi1.getPajak());
	}
}
