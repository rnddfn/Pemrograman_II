package modul2;

class Buah{
	String nama;
	double berat;
	double harga;
	double jumlah;
	double hargaAwal;
	double diskon;
	double hargaAkhir;
	
	void perhitunganDiskon() {
		diskon = (Math.floor(jumlah/4) * 0.02 * harga*4);
	}
	
	void hitungHargaAwal() {
		hargaAwal = harga * (jumlah / berat);
	}
	
	void hitungHargaAkhir() {
		hargaAkhir = hargaAwal - diskon;
	}
	
	void infoBuah(){
		System.out.println("Nama Buah: " + nama);
		System.out.println("Berat: " + berat);
		System.out.println("Harga: " + harga);
		System.out.println("Jumlah Beli: " + jumlah + "kg");
		System.out.println("Harga Sebelum Diskon: Rp" + hargaAwal);
		System.out.println("Total Diskon: Rp" + diskon);
		System.out.println("Harga Setelah Diskon: Rp" + hargaAkhir);
		System.out.println();
	}
}


public class soal1 {
	public static void main(String[] args) {
		Buah apel = new Buah();
		Buah mangga = new Buah();
		Buah alpukat= new Buah();
		
		apel.nama = "Apel";
		apel.berat = 0.4;
		apel.harga = 7000;
		apel.jumlah = 40;
		
		mangga.nama = "Mangga";
		mangga.berat = 0.2;
		mangga.harga = 3500;
		mangga.jumlah = 15;
		
		alpukat.nama = "Alpukat";
		alpukat.berat = 0.25;
		alpukat.harga = 10000;
		alpukat.jumlah = 12;
		
		apel.hitungHargaAwal();
		apel.perhitunganDiskon();
		apel.hitungHargaAkhir();
		apel.infoBuah();
		
		mangga.hitungHargaAwal();
		mangga.perhitunganDiskon();
		mangga.hitungHargaAkhir();
		mangga.infoBuah();

		alpukat.hitungHargaAwal();
		alpukat.perhitunganDiskon();
		alpukat.hitungHargaAkhir();
		alpukat.infoBuah();

	}

}
