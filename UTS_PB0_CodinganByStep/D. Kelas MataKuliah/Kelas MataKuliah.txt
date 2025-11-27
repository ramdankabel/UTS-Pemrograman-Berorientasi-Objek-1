public class MataKuliah {

    private String kode;
    private String namaMatkul;
    private int sks;

    // Constructor
    public MataKuliah(String kode, String namaMatkul, int sks) {
        setKode(kode);
        setNamaMatkul(namaMatkul);
        setSks(sks);
    }

    // Getter & Setter dengan Validasi
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        if (kode == null || !kode.matches("MK\\d+")) {
            throw new IllegalArgumentException(
                "Kode harus diawali huruf 'MK' diikuti angka (contoh: MK001)"
            );
        }
        this.kode = kode;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        if (namaMatkul == null || namaMatkul.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama mata kuliah tidak boleh kosong!");
        }
        this.namaMatkul = namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        if (sks < 1 || sks > 4) {
            throw new IllegalArgumentException("SKS harus antara 1 - 4");
        }
        this.sks = sks;
    }

    // Method tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("=== DATA MATA KULIAH ===");
        System.out.println("Kode Matkul : " + kode);
        System.out.println("Nama Matkul : " + namaMatkul);
        System.out.println("SKS         : " + sks);
    }
}
