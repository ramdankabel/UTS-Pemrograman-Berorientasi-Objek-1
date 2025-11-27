public class Main {
    public static void main(String[] args) {

        System.out.println("=== MEMBUAT OBJEK SISTEM AKADEMIK ===\n");

        // Membuat objek MataKuliah
        MataKuliah mk1 = null;
        try {
            mk1 = new MataKuliah("MK001", "Pemrograman Berorientasi Objek 1", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = null;
        try {
            mhs1 = new Mahasiswa(
                "Muhammad Ramdan",
                "ramdankabel@gmail.com",
                "Tasikmalaya",
                "082118427261",
                "M24552011065",
                "Teknik Informatika",
                3.55
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Membuat objek Dosen
        Dosen ds1 = null;
        try {
            ds1 = new Dosen(
                "Siti Maryam, S.Kom.",
                "sitimaryam@utb-univ.ac.id",
                "Bandung",
                "08123456789",
                "D98765",
                "Pemrograman Berorientasi Objek 1"
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== MENAMPILKAN INFORMASI ===\n");

        // Tampilkan info semua objek
        if (mk1 != null) mk1.tampilkanInfo();
        System.out.println();

        if (mhs1 != null) mhs1.tampilkanInfo();
        System.out.println();

        if (ds1 != null) ds1.tampilkanInfo();
        System.out.println();

        // Interaksi antar objek
        System.out.println("=== INTERAKSI ===");
        if (mhs1 != null && mk1 != null) {
            mhs1.ambilMataKuliah(mk1);
        }
        if (ds1 != null) {
            ds1.mengajar();
        }
    }
}
