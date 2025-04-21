import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah matkul = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah matkul2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah matkul3 = new MataKuliah("MK003", "Desain Web", 3);
        while (true) {
            System.out.println("===MENU SISTEM AKADEMIK===");
            System.out.println("1. Tampilkan Dartar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                
            } else if (menu == 2) {
                System.out.println();
                System.out.println("Daftar Mata Kuliah:");
                matkul.tampilMataKuliah();
                matkul2.tampilMataKuliah();
                matkul3.tampilMataKuliah();
                System.out.println();
            } else if (menu == 3) {
                
            } else if (menu == 4) {
                
            } else if (menu ==5 ) {
                
            } else if (menu == 0) {
                System.out.println("Terima Kasih");
                return;
            } else {
                System.out.println("Masukkan angka dari (0 - 5)");
            }
        }
    }
}