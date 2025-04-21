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
    }

    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * this.nilaiTugas) + (0.35 * this.nilaiUTS) + (0.35 * this.nilaiUAS);
    }
}
