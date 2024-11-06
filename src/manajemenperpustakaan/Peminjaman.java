package manajemenperpustakaan;

import java.util.Date;

/**
 * Kelas ini mewakili peminjaman buku oleh anggota di perpustakaan.
 *
 * @author 10121142 - Asifa Lestari
 */
public class Peminjaman {
    private Buku book;
    private Anggota member;
    private Date loanDate;
    private Date returnDate;

    /**
     * Konstruktor untuk membuat peminjaman buku oleh anggota.
     *
     * @param book manajemenperpustakaan.Buku yang dipinjam.
     * @param member manajemenperpustakaan.Anggota yang meminjam buku.
     */
    public Peminjaman(Buku book, Anggota member) {
        this.book = book;
        this.member = member;
        this.loanDate = new Date();
        this.returnDate = null;
    }

    /**
     * Mengambil buku yang dipinjam.
     *
     * @return manajemenperpustakaan.Buku yang dipinjam.
     */
    public Buku getBook() {
        return book;
    }

    /**
     * Mengatur buku yang dipinjam.
     *
     * @param book manajemenperpustakaan.Buku yang baru.
     */
    public void setBook(Buku book) {
        this.book = book;
    }

    /**
     * Mengambil anggota yang meminjam buku.
     *
     * @return manajemenperpustakaan.Anggota yang meminjam buku.
     */
    public Anggota getMember() {
        return member;
    }

    /**
     * Mengatur anggota yang meminjam buku.
     *
     * @param member manajemenperpustakaan.Anggota yang baru.
     */
    public void setMember(Anggota member) {
        this.member = member;
    }

    /**
     * Mengambil tanggal peminjaman buku.
     *
     * @return Tanggal peminjaman buku.
     */
    public Date getLoanDate() {
        return loanDate;
    }

    /**
     * Mengatur tanggal peminjaman buku.
     *
     * @param loanDate Tanggal peminjaman buku yang baru.
     */
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    /**
     * Mengambil tanggal pengembalian buku.
     *
     * @return Tanggal pengembalian buku.
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * Mengatur tanggal pengembalian buku.
     *
     * @param returnDate Tanggal pengembalian buku yang baru.
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
