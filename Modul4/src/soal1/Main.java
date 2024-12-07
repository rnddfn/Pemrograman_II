package soal1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("Nama Hewan Peliharaan: ");
		String nama = input.nextLine();
		System.out.print("ras: ");
		String ras = input.nextLine();
		HewanPeliharaan kucing = new HewanPeliharaan(nama, ras);
		kucing.Display();
	}
}
