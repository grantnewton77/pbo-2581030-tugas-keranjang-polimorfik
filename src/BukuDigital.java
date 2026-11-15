public class BukuDigital extends Buku implements BisaDiunduh {
    private String ukuranFile;

    public BukuDigital(String judul, String penulis, int harga, String ukuranFile) {
        super(judul, penulis, harga);
        this.ukuranFile = ukuranFile;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() - (getHarga() * 20 / 100);
    }

    @Override
    public String keterangan() {
        return ukuranFile + ", diskon 20%";
    }

    @Override
    public String linkUnduh() {
        String slug = getJudul().toLowerCase().replace(" ", "-");
        return "https://toko.buku/ebook/" + slug;
    }
}
