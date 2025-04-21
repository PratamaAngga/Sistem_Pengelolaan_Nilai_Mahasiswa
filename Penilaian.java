public class penilaian {
    mahasiswa mhs[] = new mahasiswa[5];
    MataKuliah matkul[] = new MataKuliah[5];
    
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public penilaian(mahasiswa mahasiswa, MataKuliah matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = 0; 
    }

    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (0.3 * this.nilaiTugas) + (0.35 * this.nilaiUTS) + (0.35 * this.nilaiUAS);
    }
}
