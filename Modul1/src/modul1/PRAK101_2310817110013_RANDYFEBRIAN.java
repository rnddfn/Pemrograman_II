package modul1;
import java.util.Scanner;
import java.util.Locale;

public class PRAK101_2310817110013_RANDYFEBRIAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Lengkap: ");
		String namaLengkap = input.nextLine();
		
		System.out.print("Masukkan Tempat Lahir: ");
		String tempatLahir = input.nextLine();
		
		System.out.print("Masukkan Tanggal Lahir: ");
		int tanggalLahir= input.nextInt();
		
		System.out.print("Masukkan Bulan Lahir: ");
		int bulanLahir = input.nextInt();
		
		System.out.print("Masukkan Tahun Lahir: ");
		int tahunLahir = input.nextInt();
		
		System.out.print("Masukkan Tinggi Badan: ");
		int tinggiBadan = input.nextInt();
		
		System.out.print("Masukkan Berat Badan: ");
		double beratBadan = input.nextDouble();
		
		String bulanLahirKata = "";
		switch (bulanLahir) {
		    case 1:
		        bulanLahirKata = "Januari";
		        break;
		    case 2:
		        bulanLahirKata = "Februari";
		        break;
		    case 3:
		        bulanLahirKata = "Maret";
		        break;
		    case 4:
		        bulanLahirKata = "April";
		        break;
		    case 5:
		        bulanLahirKata = "Mei";
		        break;
		    case 6:
		        bulanLahirKata = "Juni";
		        break;
		    case 7:
		        bulanLahirKata = "Juli";
		        break;
		    case 8:
		        bulanLahirKata = "Agustus";
		        break;
		    case 9:
		        bulanLahirKata = "September";
		        break;
		    case 10:
		        bulanLahirKata = "Oktober";
		        break;
		    case 11:
		        bulanLahirKata = "November";
		        break;
		    case 12:
		        bulanLahirKata = "Desember";
		        break;
		    default:
		        bulanLahirKata = "Bulan tidak valid";
		        break;
		}
	
		System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + ", pada Tanggal " + tanggalLahir + " " + bulanLahirKata + " " + tahunLahir);
		System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan +" kilogram");
	}
	
}
