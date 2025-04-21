public static void menu3UrutkanNilaiAkhir(Penilaian[] daftarNilai) {
    for (int i = 0; i < daftarNilai.length - 1; i++) {
        for (int j = 0; j < daftarNilai.length - i - 1; j++) {
            if (daftarNilai[j].getNilaiAkhir() < daftarNilai[j + 1].getNilaiAkhir()) {
                // Tukar jika nilai akhir lebih kecil
                Penilaian temp = daftarNilai[j];
                daftarNilai[j] = daftarNilai[j + 1];
                daftarNilai[j + 1] = temp;
            }
        }
    }

    System.out.println("Data setelah diurutkan berdasarkan nilai akhir (tertinggi ke terendah):");
    for (Penilaian p : daftarNilai) {
        System.out.println("NIM: " + p.getMahasiswa().getNim() +
                           ", Nama: " + p.getMahasiswa().getNama() +
                           ", Mata Kuliah: " + p.getMatakuliah().getNamaMatkul() +
                           ", Nilai Akhir: " + p.getNilaiAkhir());
    }
}
