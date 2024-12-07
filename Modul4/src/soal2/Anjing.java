package soal2;

import java.util.Arrays;

public class Anjing extends HewanPeliharaan {

	String warnaBulu;
	String[] kemampuan;
	
	public Anjing(String n, String r, String w, String[] k) {
		super(n, r);
		this.warnaBulu = w;
		this.kemampuan = k;
	}	
	
	public void displayDetailAnjing() {
		super.Display();
		System.out.println("Memiliki warna bulu: " + this.warnaBulu);
        String kemampuanString = String.join(" ", this.kemampuan);
        System.out.println("Memiliki Kemampuan: " + kemampuanString.replace(",", ""));
	}
}
