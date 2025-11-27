public class Dosen extends User {

    private String nidn;
    private String mataKuliahAjar;

    // Constructor
    public Dosen(String nama, String email, String alamat, String noHP,
                 String nidn, String mataKuliahAjar) {
        super(nama, email, alamat, noHP); // memanggil constructor User
        setNidn(nidn);
        setMataKuliahAjar(mataKuliahAjar);
    }

    // Getter dan Setter dengan Validasi
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        if (nidn == null || !nidn.matches("D\\d+")) {
            throw new IllegalArgumentException(
                "NIDN harus diawali huruf besar 'D' dan diikuti angka (contoh: D98765)"
            );
        }
        this.nidn = nidn;
    }

    public String getMataKuliahAjar() {
        return mataKuliahAjar;
    }

    public void setMataKuliahAjar(String mataKuliahAjar) {
        if (mataKuliahAjar == null || mataKuliahAjar.trim().isEmpty()) {
            throw new IllegalArgumentException("Mata kuliah ajar tidak boleh kosong!");
        }
        this.mataKuliahAjar = mataKuliahAjar;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("=== DATA DOSEN ===");
        super.tampilkanInfo();
        System.out.println("NIDN            : " + nidn);
        System.out.println("Mata Kuliah Ajar: " + mataKuliahAjar);
    }

    // Method mengajar()
    public void mengajar() {
        System.out.println("Dosen " + getNama() +
                " sedang mengajar mata kuliah " + mataKuliahAjar);
    }
}
