public class Penilaian {
    Mahasiswa mhs;
    MataKuliah matkul;
    
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mhs, MataKuliah matkul, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mhs = mhs;
        this.matkul = matkul;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = 0; 
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * this.nilaiTugas) + (0.35 * this.nilaiUTS) + (0.35 * this.nilaiUAS);
    }

    void tampil() {
        System.out.printf("|%-7s | %-15s | %-25s | %-20s | %-5s |\n", 
        mhs.nim, mhs.nama, mhs.prodi, matkul.namaMK, nilaiAkhir);
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
    public static void urutkanPenilaianBerdasarkanNilai(Penilaian[]data) {
        for (int i = 0; i < data.length -1; i++) {
            for (int j = 0; j < data.length -i -1;j++) {
                if (data[j].getNilaiAkhir() < data[j + 1].getNilaiAkhir()) {
                    Penilaian temp = data[j]; data[j] = data[j + 1]; data[j + 1] = temp;
                }
            }
        }         
        }
    }

