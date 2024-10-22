package modul2;

//Pada baris ini terjadi error karena nama class yang tidak sesuai dengan class.java
//public class Employee { 
    public class Pegawai{
	public String nama; 
    // Pada baris ini terjadi error karena asal memiliki tipe data char, seharusnya String
	// public char asal; 
	public String asal;
    public String jabatan; 
    public int umur; 
 
    public String getNama() { 
        return nama; 
    } 
 
    public String getAsal() { 
        return asal; 
    } 
 
//    Pada baris ini terjadi error karena seharusnya terdapat parameter
//    public void setJabatan() { 
    public void setJabatan(String j) {
        //Pada baris ini terjadi error karena adanya this. didepan atribut
    	//this.jabatan = j; 
    	jabatan = j;
    } 
} 