package soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Dadu {
	int min = 1;
	int max = 6;
	int acakNilai() {
		return (int) (Math.random()*(max-min+1)+ min);
	}
	
	public static void main(String[] args) {
		int jumlahLempar;
		int hasil = 0;
		Dadu dadu1 = new Dadu();
		LinkedList<Integer> nilai = new LinkedList<Integer>();
		
		Scanner input = new Scanner(System.in);
		jumlahLempar = input.nextInt();
		
		for(int i = 0; i < jumlahLempar; i++) {
			nilai.add(dadu1.acakNilai());
			hasil += nilai.get(i);
			System.out.println("Dadu ke-" + (i + 1) + " Bernilai " + nilai.get(i));
		}
		System.out.println("Total nilai dadu keseluruhan " + hasil);
		input.close();
	}
}
