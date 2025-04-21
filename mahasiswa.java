public class mahasiswa {
    String nim;
    String nama;
    String prodi;

    mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampil() {
       String format = "|%-7s | %-15s | %-20s |\n";
       System.out.printf(format, "NIM", "Nama", "Prodi");
       System.out.println("|---------|-----------------|----------------------");
       System.out.printf(format, nim, nama, prodi); 
    }
}