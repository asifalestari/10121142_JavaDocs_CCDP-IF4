package manajemenperpustakaan;

/**
 * Kelas ini mengelola peminjaman dan pengembalian buku di perpustakaan.
 *
 * @author 10121142 - Asifa Lestari
 *
 */
public class LibraryManager {
    private Perpustakaan library;

    /**
     * Konstruktor untuk membuat manajer perpustakaan yang mengelola perpustakaan tertentu.
     *
     * @param library manajemenperpustakaan.Perpustakaan yang akan dikelola.
     */
    public LibraryManager(Perpustakaan library) {
        this.library = library;
    }

    /**
     * Meminjamkan buku kepada anggota yang terdaftar.
     *
     * @param book manajemenperpustakaan.Buku yang akan dipinjam.
     * @param member manajemenperpustakaan.Anggota yang akan meminjam buku.
     */
    public void loanBook(Buku book, Anggota member) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            Peminjaman loan = new Peminjaman(book, member);
            System.out.println(member.getNama() + " meminjam buku " + book.getJudul());
        } else {
            System.out.println("manajemenperpustakaan.Buku tidak tersedia.");
        }
    }

    /**
     * Mengembalikan buku ke perpustakaan.
     *
     * @param book manajemenperpustakaan.Buku yang akan dikembalikan.
     */
    public void returnBook(Buku book) {
        book.setAvailable(true);
        System.out.println("manajemenperpustakaan.Buku " + book.getJudul() + " telah dikembalikan.");
    }
}
