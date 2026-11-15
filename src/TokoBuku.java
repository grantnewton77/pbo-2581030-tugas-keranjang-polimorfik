public class TokoBuku {

    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;

        for (Buku buku : keranjang) {
            total += buku.hargaAkhir();
        }

        return total;
    }

    public static void main(String[] args) {

        // Membuat empat objek buku
        BukuCetak cetak1 = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750);

        BukuCetak cetak2 = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400);

        BukuDigital digital = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, "12.5 MB");

        BukuAudio audio = new BukuAudio(
                "Kisah Programmer", "Budi Santoso", 60000, 240);

        // Memasukkan semua buku ke keranjang
        Buku[] keranjang = {
                cetak1, cetak2, digital, audio
        };

        // Menyimpan buku yang bisa diunduh
        BisaDiunduh[] unduhan = {
                digital, audio
        };

        System.out.println("=============== KERANJANG ================");

        // Menampilkan informasi semua buku
        for (Buku buku : keranjang) {
            buku.tampilkanInfo();
        }

        System.out.println("------------------------------------------");

        // Menghitung total pembayaran
        System.out.println("Total bayar   : Rp" +
                Buku.formatRupiah(hitungTotal(keranjang)));

        System.out.println();

        // Menampilkan link unduhan
        System.out.println("============= LINK UNDUH ================");

        for (BisaDiunduh buku : unduhan) {
            System.out.println(buku.linkUnduh());
        }

        // Pengujian abstract class:
        // Buku b = new Buku("X", "Y", 1);
        // Error: Buku is abstract; cannot be instantiated.
    }
}
