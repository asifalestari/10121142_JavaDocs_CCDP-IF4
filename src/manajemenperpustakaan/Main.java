package manajemenperpustakaan;

/**
 * Kelas Main ini digunakan untuk menjalankan aplikasi sistem manajemen perpustakaan.
 * Program ini menginisialisasi data buku, anggota, dan kemudian melakukan peminjaman serta pengembalian buku.
 *
 * @author 10121142 - Asifa Lestari
 *
 */

public class Main {
    /**
     * Metode ini membuat objek perpustakaan, menambahkan buku dan anggota, serta melakukan peminjaman dan pengembalian buku.
     *
     * @param args Argumen dari command line (tidak digunakan dalam aplikasi ini).
     *
     */
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Perpustakaan library = new Perpustakaan();

        // Menambahkan buku ke perpustakaan
        Buku book1 = new Buku("Java Programming", "John Doe", "123456");
        Buku book2 = new Buku("Clean Code", "Robert C. Martin", "654321");
        library.addBook(book1);
        library.addBook(book2);

        // Menambahkan anggota
        Anggota member1 = new Anggota("Alice", "M001");
        Anggota member2 = new Anggota("Bob", "M002");
        library.addMember(member1);
        library.addMember(member2);

        // Menampilkan daftar buku dan anggota
        library.listBooks();
        library.listMembers();

        // Meminjam buku
        LibraryManager libraryManager = new LibraryManager(library);
        libraryManager.loanBook(book1, member1);

        // Mengembalikan buku
        libraryManager.returnBook(book1);
    }
}
