import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa dafMahasiswa[] = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Ali Rahman", "Sistem Informasi Bisnis"),
        };
        MataKuliah []matkul = new MataKuliah[3];
        matkul[0] = new MataKuliah("MK001", "Struktur Data", 3);
        matkul[1] = new MataKuliah("MK002", "Basis Data", 3);
        matkul[2] = new MataKuliah("MK003", "Desain Web", 3);
        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Dartar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println();
                System.out.println("\nDaftar Mahasiswa:");
                System.out.println();
                String format = "|%-7s | %-15s | %-25s |\n";
                System.out.printf(format, "NIM", "Nama", "Prodi");
                System.out.println("|--------|-----------------|---------------------------|");

                for (Mahasiswa mhs : dafMahasiswa) {
                    mhs.tampil();
                }
                System.out.println("--------------------------------------------------------");
            } else if (menu == 2) {
                System.out.println();
                System.out.println("Daftar Mata Kuliah:");
                for (int i = 0; i < matkul.length; i++) {
                    matkul[i].tampilMataKuliah();
                }
                System.out.println();
            } else if (menu == 3) {
                
            } else if (menu == 4) {
                
            } else if (menu == 5) {
                System.out.println();
                System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                String nim = sc.next();
                int posisi = -1;
                for (int i = 0; i < dafMahasiswa.length; i++) {
                    if (dafMahasiswa[i].nim==nim) {
                        posisi = i;
                        break;
                    }
                }
                if (posisi!= -1) {
                    System.out.println("Mahasiswa Ditemukan: " + Mahasiswa[posisi]);
                } else {
                    System.out.println("Mahasiswa Dengan NIM " + nim + "Tidak Ditemukan");
                }
                System.out.println();
            } else if (menu == 0) {
                System.out.println("Terima Kasih!");
                return;
            } else {
                System.out.println("Masukkan angka dari (0 - 5)");
                System.out.println();
            }
        }
    }
}