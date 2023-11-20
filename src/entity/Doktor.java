package entity;

public class Doktor extends Insan implements HastaligiTasiyabilir {
    private String mezunOlduğuUniversiteİsmi;
    private Kurum calıştıgıKurumİsmi;
    private String uzmanlıkAlanı;
    private boolean tasiyiciMi;

    public Doktor(long tC, String isim, String soyisim, String dogumTarihi, String dogumYeri, String yasanılanYer, int yas, String mezunOlduğuUniversiteİsmi, Kurum calıştıgıKurumİsmi, String uzmanlıkAlanı, boolean tasiyiciMi) {
        super(tC, isim, soyisim, dogumTarihi, dogumYeri, yasanılanYer, yas);
        this.mezunOlduğuUniversiteİsmi = mezunOlduğuUniversiteİsmi;
        this.calıştıgıKurumİsmi = calıştıgıKurumİsmi;
        this.uzmanlıkAlanı = uzmanlıkAlanı;
        this.tasiyiciMi = tasiyiciMi;
    }

    public String getMezunOlduğuUniversiteİsmi() {
        return mezunOlduğuUniversiteİsmi;
    }


    public Kurum getCalıştıgıKurumİsmi() {
        return calıştıgıKurumİsmi;
    }


    public String getUzmanlıkAlanı() {
        return uzmanlıkAlanı;
    }
    public boolean isTasiyiciMi() {
        return tasiyiciMi;
    }
    @Override
    public void hastaligiTasi() {
        tasiyiciMi = true;
    }
}
