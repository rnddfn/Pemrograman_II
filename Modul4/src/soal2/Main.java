package soal2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
		System.out.println("1 = Kucing");
		System.out.println("2 = Anjing");
		System.out.println("Masukkan pilihan: ");
		int pilihan = input.nextInt();
		input.nextLine();
		System.out.println("Nama Hewan Peliharaan: " );
		String nama = input.nextLine();
		System.out.println("ras: ");
		String ras = input.nextLine();
		if(pilihan == 1) {
			System.out.println("Warna Bulu: ");
			String warnaBulu = input.nextLine();
			Kucing kucing = new Kucing(nama, ras, warnaBulu);
			kucing.displayDetailKucing();
		} else if(pilihan == 2) {
			System.out.println("Warna Bulu: ");
			String warnaBulu = input.nextLine();
			System.out.println("kemampuan: ");
			String[] kemampuan = new String[] {input.nextLine()};
			Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
			anjing.displayDetailAnjing();
		}
	}
}
