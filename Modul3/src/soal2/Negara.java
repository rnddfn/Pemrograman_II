package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Negara {
	String nama;
	String jenis;
	String namaPemimpin;
	int tanggal;
	int bulan;
	int tahun;
	
	public Negara(String namaNegara, String jenisNegara, String namaPemimpinNegara, 
				  int tanggalMerdeka, int bulanMerdeka, int tahunMerdeka) {
		nama = namaNegara;
		jenis = jenisNegara;
		namaPemimpin = namaPemimpinNegara;
		tanggal = tanggalMerdeka;
		bulan = bulanMerdeka;
		tahun = tahunMerdeka;
	}
	
	public static void main(String[] args) {
		int jumlahNegara;
		LinkedList<Negara> listNegara = new LinkedList<>();
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");
		
		Scanner input = new Scanner(System.in);
		jumlahNegara = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < jumlahNegara; i++) {
			String nama = input.nextLine();
			String jenis = input.nextLine();
			String namaPemimpin = input.nextLine();
			int tanggal = 0;
			int bulan = 0;
			int tahun = 0;
			
			if(!jenis.equals("monarki")) {
				tanggal = input.nextInt();
				bulan = input.nextInt();
				tahun = input.nextInt();
				input.nextLine();
			}
			
			Negara negara = new Negara(nama, jenis, namaPemimpin, tanggal, bulan, tahun);
			listNegara.add(negara);
		}
		
		for(Negara negara: listNegara) {
			String title;
			if (negara.jenis.equals("monarki")) {
			    title = "Raja";
			} else if (negara.jenis.equals("presiden")) {
			    title = "Presiden";
			} else {
			    title = "Perdana Menteri";
			}
			System.out.println("Negara " + negara.nama + " mempunyai " + title + " bernama " + negara.namaPemimpin);
			
			if(negara.jenis.equals("monarki")) {
				System.out.println();
			} else {
				System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.tanggal + " " + namaBulan.get(negara.bulan)
				+ " " + negara.tahun);
				System.out.println();
			}
		}
		input.close();
	}
}
