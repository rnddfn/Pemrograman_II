package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private long NIM;

    Mahasiswa(String nama, long NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    String getNama() {
        return this.nama;
    }

    long getNIM() {
        return this.NIM;
    }

    @Override
    public String toString() {
        return "Nama: " + this.nama + ", NIM: " + this.NIM;
    }

    public static void main(String[] args) {
        ArrayList<Mahasiswa> mhsList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean jalan = true;
        while (jalan) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 0:
                    jalan = false;
                    System.out.println("Terima kasih!");
                    break;

                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    long NIM = input.nextLong();

                    mhsList.add(new Mahasiswa(nama, NIM));
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    long nimDihapus = input.nextLong();

                    boolean dapatDihapus = false;
                    for (Mahasiswa mhs : mhsList) {
                        if (mhs.getNIM() == nimDihapus) {
                            mhsList.remove(mhs);
                            System.out.println("Mahasiswa dengan NIM " + nimDihapus + " dihapus.");
                            dapatDihapus = true;
                            break;
                        }
                    }

                    if (!dapatDihapus) {
                        System.out.println("Mahasiswa dengan NIM " + nimDihapus + " tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    long nimDicari = input.nextLong();

                    boolean ditemukan = false;
                    for (Mahasiswa mhs : mhsList) {
                        if (mhs.getNIM() == nimDicari) {
                            System.out.println("Mahasiswa ditemukan: " + mhs);
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM " + nimDicari + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (mhsList.isEmpty()) {
                        System.out.println("Daftar mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa mhs : mhsList) {
                            System.out.println(mhs);
                        }
                    }
                    break;

                default:
                    System.out.println("Angka yang dimasukkan tidak valid, silakan coba lagi");
            }
        }
        input.close();
    }
}