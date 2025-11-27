// Subclass: Mahasiswa
public class Mahasiswa extends User {

    // Attributes
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String email, String alamat, String noHP,
                     String nim, String jurusan, double ipk) {

        super(nama, email, alamat, noHP); // memanggil constructor User

        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // tampilkan info dari User
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    // Getter & Setter dengan validasi
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        if (!nim.matches("^M\\d+$")) {
            System.out.println("NIM harus diawali huruf 'M' diikuti angka (contoh: M12345).");
        } else {
            this.nim = nim;
        }
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan.isEmpty()) {
            System.out.println("Jurusan tidak boleh kosong.");
        } else {
            this.jurusan = jurusan;
        }
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK harus antara 0.00 - 4.00.");
        } else {
            this.ipk = ipk;
        }
    }

    // Method tambahan
    public void ambilMataKuliah(MataKuliah mk) {
        System.out.println("Mahasiswa " + getNama() + 
                           " mengambil mata kuliah " + mk.getNamaMatkul());
    }
}
