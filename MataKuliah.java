public class MataKuliah {
    // public String []kodeMK = {"MK001", "MK002", "MK003"};
    // public String []namaMK = {"Struktur Data", "Basis Data", "Desain Web"};
    // public int []sks = {3, 3, 3};
    public String kodeMK;
    public String namaMK;
    public int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK=kodeMK;
        this.namaMK=namaMK;
        this.sks=sks;
    }
    void tampilMataKuliah(){
        System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK + " | SKS : " + sks );
    }
}
