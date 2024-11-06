package manajemenperpustakaan;

/**
 * Kelas ini mewakili anggota perpustakaan.
 * Setiap anggota memiliki nama dan ID Anggota yang digunakan untuk meminjam buku.
 *
 * @author 10121142 - Asifa Lestari
 *
 */

public class Anggota {
    private String nama;
    private String idAnggota;

    /**
     * Konstruktor untuk membuat objek manajemenperpustakaan.Anggota dengan nama dan ID anggota.
     *
     * @param nama Nama anggota.
     * @param idAnggota ID anggota.
     */
    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    /**
     * Mengambil nama anggota.
     *
     * @return Nama anggota.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengatur nama anggota.
     *
     * @param nama Nama anggota yang baru.
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * Mengambil ID anggota.
     *
     * @return ID anggota.
     */
    public String getIdAnggota() {
        return idAnggota;
    }

    /**
     * Mengatur ID anggota.
     *
     * @param idAnggota ID anggota yang baru.
     */
    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

}
