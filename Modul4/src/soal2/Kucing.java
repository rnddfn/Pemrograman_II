package soal2;

public class Kucing extends HewanPeliharaan {
	String warnaBulu;
	
	public Kucing(String n, String r, String w) {
		super(n, r);
		this.warnaBulu = w;
	}	
	
	public void displayDetailKucing() {
		super.Display();
		System.out.println("Memiliki warna bulu: " + this.warnaBulu);
	}
}
