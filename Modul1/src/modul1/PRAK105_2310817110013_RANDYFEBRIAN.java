package modul1;
import java.util.Scanner;
import java.io.*;

public class PRAK105_2310817110013_RANDYFEBRIAN {
	public static final double phi = 3.14;
	
	public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jarijari= inputan.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = inputan.nextDouble();
        
        double volume = phi * jarijari * jarijari * tinggi;
        System.out.format("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", jarijari, tinggi, volume);
	}
}
