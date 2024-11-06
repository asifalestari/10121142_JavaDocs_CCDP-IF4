package manajemenperpustakaan;

import java.util.ArrayList;
import java.util.List;


/**
 * Kelas ini mewakili perpustakaan untuk menyimpan koleksi buku dan daftar anggota.
 *
 * @author 10121142 - Asifa Lestari
 *
 */
public class Perpustakaan {
    private List<Buku> books;
    private List<Anggota> members;

    /**
     * Konstruktor untuk membuat objek manajemenperpustakaan.Perpustakaan yang kosong.
     */
    public Perpustakaan() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    /**
     * Menambahkan buku ke dalam perpustakaan.
     *
     * @param book manajemenperpustakaan.Buku yang akan ditambahkan ke perpustakaan.
     */
    public void addBook(Buku book) {
        books.add(book);
    }

    /**
     * Menambahkan anggota ke dalam perpustakaan.
     *
     * @param member manajemenperpustakaan.Anggota yang akan ditambahkan.
     */
    public void addMember(Anggota member) {
        members.add(member);
    }

    /**
     * Menampilkan daftar semua buku yang ada di perpustakaan.
     */
    public void listBooks() {
        for (Buku book : books) {
            System.out.println("Judul manajemenperpustakaan.Buku: " + book.getJudul() + ", Penulis: " + book.getPenulis() + ", ISBN: " + book.getIsbn());
        }
    }

    /**
     * Menampilkan daftar semua anggota yang terdaftar di perpustakaan.
     */
    public void listMembers() {
        for (Anggota member : members) {
            System.out.println("Nama: " + member.getNama() + ", ID manajemenperpustakaan.Anggota: " + member.getIdAnggota());
        }
    }

}
