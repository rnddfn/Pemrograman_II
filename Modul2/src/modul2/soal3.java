package modul2;

public class soal3 {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai(); 
//		Pada baris ini terjadi error karena kurang ;
//      p1.nama = "Roi" 
		p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; 
        p1.setJabatan("Assasin"); 
//      Pada bagian output tidak terdapat cetak umur karena nilai umur tidak ada
        p1.umur = 17;
 
        System.out.println("Nama Pegawai: " + p1.getNama()); 
        System.out.println("Asal: " + p1.getAsal()); 
        System.out.println("Jabatan: " + p1.jabatan); 
        System.out.println("Umur: " + p1.umur); 
	}
}
