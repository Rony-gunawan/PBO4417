public class BukuDemo {
	
    public static void main(String[] args) {
		
        Buku buku1 = new Buku("PBO", "Aku", "Terbit", 2000);
        buku1.cetakBuku();
        Buku buku2 = new Buku("Learning Java", "Rony", "Terang", 1999);
        buku2.cetakBuku();
	
    }
}


class Buku {
	
    private String judul;
    private String pengarang;
    private String penerbit;
    private Integer tahun;

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    public void cetakBuku() {
        if (this.judul == null && this.pengarang == null && this.penerbit == null && this.tahun == null) {
            System.out.println("Inputkan judul buku = , Inputkan pengarang = , Inputkan penerbit = , Inputkan tahun terbit = ");
        } else {
            System.out.println(judul + ", " + pengarang + ", " + penerbit + ", " + tahun);
        }
    }
}