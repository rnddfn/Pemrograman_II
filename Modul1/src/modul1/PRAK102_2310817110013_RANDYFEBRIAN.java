package modul1;
import java.util.Scanner;

public class PRAK102_2310817110013_RANDYFEBRIAN {

	public static void main(String[] args) {
		int batasAtas = 0;
		int batasBawah;
		
		Scanner input = new Scanner(System.in);
		batasBawah = input.nextInt();
		
		while(batasAtas < 11) {
			if(batasBawah % 5 == 0) {
				int kelipatan = batasBawah / 5 - 1;
				System.out.print(kelipatan);
			} else {
				System.out.print(batasBawah);
			}
			
			if(batasAtas < 10) {
				System.out.print(", ");
			}
			batasAtas++;
			batasBawah++;
		}
	}
}
