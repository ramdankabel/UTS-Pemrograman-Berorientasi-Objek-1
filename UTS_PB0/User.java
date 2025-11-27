// Superclass: User
public class User {
    // Attributes
    private String nama;
    private String email;
    private String alamat;
    private String noHP;

    // Constructor
    public User(String nama, String email, String alamat, String noHP) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.noHP = noHP;
    }

    // Method to display user information
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("NoHP: " + noHP);
    }

    // Getter and Setter for nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong.");
        } else {
            this.nama = nama;
        }
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Email harus mengandung karakter '@'.");
        } else {
            this.email = email;
        }
    }

    // Getter and Setter for alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        if (alamat.isEmpty()) {
            System.out.println("Alamat tidak boleh kosong.");
        } else {
            this.alamat = alamat;
        }
    }

    // Getter and Setter for noHP
    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        if (noHP.length() < 10) {
            System.out.println("NoHP minimal 10 digit angka.");
        } else {
            this.noHP = noHP;
        }
    }
}
