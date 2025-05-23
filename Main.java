import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa dafMahasiswa[] = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"),
        };

        MataKuliah []matkul = new MataKuliah[3];
        matkul[0] = new MataKuliah("MK001", "Struktur Data", 3);
        matkul[1] = new MataKuliah("MK002", "Basis Data", 3);
        matkul[2] = new MataKuliah("MK003", "Desain Web", 3);
        
        Penilaian daftarNilai[] = {
            new Penilaian(dafMahasiswa[0], matkul[0], 80, 85, 90),
            new Penilaian(dafMahasiswa[0], matkul[1], 60, 75, 70),
            new Penilaian(dafMahasiswa[1], matkul[0], 75, 70, 80),
            new Penilaian(dafMahasiswa[2], matkul[1], 85, 90, 95),
            new Penilaian(dafMahasiswa[2], matkul[2], 80, 90, 65),
        }; //data isi variabel array


        while (true) {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

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
                System.out.println();
            } else if (menu == 2) {
                System.out.println();
                System.out.println("Daftar Mata Kuliah:");
                for (int i = 0; i < matkul.length; i++) {
                    matkul[i].tampilMataKuliah();
                }
                System.out.println();
            } else if (menu == 3) { //data dipanggil dari penilaian
                System.out.println("\n--- Data Penilaian ---");
                System.out.printf("|%-7s | %-15s | %-25s | %-20s | %-5s |\n", "NIM", "Nama", "Prodi", "Mata Kuliah", "Nilai");
                System.out.println("---------------------------------------------------------------------------------------");
                for (Penilaian i : daftarNilai) {
                    i.tampil();
                };
            System.out.println();
            } else if (menu == 4) { //bubble sorting
                Penilaian.urutkanPenilaianBerdasarkanNilai(daftarNilai);

                System.out.println("\n--- Data Penilaian (Setelah Diurutkan Descending) ---");
                System.out.printf("|%-7s | %-15s | %-20s | %-20s | %-5s |\n", "NIM", "Nama", "Prodi", "Mata Kuliah", "Nilai");
                System.out.println("----------------------------------------------------------------------------");
                for (int i = 0; i < daftarNilai.length; i++) {
                    daftarNilai[i].tampil();
    }
                System.out.println();
            } else if (menu == 5) {
                System.out.println();
                System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                String nim = sc.next();
                boolean ditemukan = false;
                for (int i = 0; i < dafMahasiswa.length; i++) {
                    if (nim.equalsIgnoreCase(dafMahasiswa[i].nim)) {
                        System.out.println("Mahasiswa Ditemukan: NIM: " + dafMahasiswa[i].nim + " | Nama: " + dafMahasiswa[i].nama + " | Prodi: " + dafMahasiswa[i].prodi );
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Mahasiswa Dengan NIM " + nim + " Tidak Ditemukan");
                }
                System.out.println();
            } else if (menu == 0) {
                System.out.println("Terima Kasih!");
                sc.close();
                return;
            } else {
                System.out.println("Masukkan angka dari (0 - 5)");
                System.out.println();
            }
        }
    }
}