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
}
