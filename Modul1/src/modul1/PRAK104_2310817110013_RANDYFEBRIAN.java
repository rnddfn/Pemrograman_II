package modul1;
import java.util.Scanner;

public class PRAK104_2310817110013_RANDYFEBRIAN {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu : ");
        String abu = input.nextLine();
        System.out.print("Tangan Bagas : ");
        String bagas = input.nextLine();

        int poinAbu = 0;
        int poinBagas = 0;
        
        for (int i = 0; i < abu.length(); i++) {
            if (abu.charAt(i) == 'G' && bagas.charAt(i) == 'B' ||
                abu.charAt(i) == 'K' && bagas.charAt(i) == 'G' ||
                abu.charAt(i) == 'B' && bagas.charAt(i) == 'K') {
                poinBagas++;  
            } else if (abu.charAt(i) == 'B' && bagas.charAt(i) == 'G' ||
                       abu.charAt(i) == 'G' && bagas.charAt(i) == 'K' ||
                       abu.charAt(i) == 'K' && bagas.charAt(i) == 'B') {
                poinAbu++;  
            }
        }
        
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else if (poinBagas == poinAbu) {
            System.out.println("Seri");
        }
    }
}
