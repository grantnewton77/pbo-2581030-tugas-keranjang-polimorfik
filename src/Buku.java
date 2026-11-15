import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    protected static String formatRupiah(int nilai) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        simbol.setDecimalSeparator(',');

        DecimalFormat format = new DecimalFormat("#,###", simbol);
        return format.format(nilai);
    }

    public abstract int hargaAkhir();

    public abstract String keterangan();

    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga        : Rp" + formatRupiah(harga));
        System.out.println("  Keterangan   : " + keterangan());
        System.out.println("  Harga akhir  : Rp" + formatRupiah(hargaAkhir()));
    }
}

