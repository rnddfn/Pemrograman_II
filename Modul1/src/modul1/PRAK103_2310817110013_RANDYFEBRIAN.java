package modul1;
import java.util.Scanner;

public class PRAK103_2310817110013_RANDYFEBRIAN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int bilanganAwal = input.nextInt();
		int i = 0;
		
		if(bilanganAwal % 2 == 0) {
			bilanganAwal++;
		}
		
		do {
			System.out.print(bilanganAwal);
			bilanganAwal += 2;
			i++;
			if(i < n) {
				System.out.print(", ");
			}
		} while (i < n);
	}
}
