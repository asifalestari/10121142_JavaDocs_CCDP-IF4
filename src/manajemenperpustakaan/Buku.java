package manajemenperpustakaan;

/**
 * Kelas ini mewakili sebuah buku dalam sistem manajemen perpustakaan.
 * Buku memiliki atribut seperti judul, penulis, dan isbn.
 *
 * Sistem ini memungkinkan pencatatan informasi buku yang tersedia di perpustakaan.
 *
 * @author 10121142 - Asifa Lestari
 *
 */

public class Buku {
    private String judul;
    private String penulis;
    private String isbn;
    private boolean isAvailable;

    /**
     * Konstruktor untuk membuat objek manajemenperpustakaan.Buku dengan judul, pengarang, dan ISBN.
     *
     * @param judul Judul buku.
     * @param penulis Pengarang buku.
     * @param isbn Nomor ISBN buku.
     */
    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
        this.isAvailable = true; // Default status is available
    }

    /**
     * Mengambil judul buku.
     *
     * @return Judul buku.
     */
    public String getJudul() {
        return judul;
    }

    /**
     * Mengatur judul buku.
     *
     * @param judul Judul buku yang baru.
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * Mengambil pengarang buku.
     *
     * @return Pengarang buku.
     */
    public String getPenulis() {
        return penulis;
    }

    /**
     * Mengatur pengarang buku.
     *
     * @param penulis Pengarang buku yang baru.
     */
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    /**
     * Mengambil nomor ISBN buku.
     *
     * @return Nomor ISBN buku.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Mengatur nomor ISBN buku.
     *
     * @param isbn Nomor ISBN buku yang baru.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Mengecek ketersediaan buku.
     *
     * @return true jika buku tersedia, false jika buku dipinjam.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Mengatur status ketersediaan buku.
     *
     * @param isAvailable Status ketersediaan buku.
     */
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
