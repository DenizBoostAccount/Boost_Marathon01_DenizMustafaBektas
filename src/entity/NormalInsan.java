package entity;

public class NormalInsan extends Insan implements Hastalanabilir, HastaligiTasiyabilir {
    private boolean asiYapildiMi;
    private boolean tasiyiciMi;
    private boolean hastaMi;
    public NormalInsan(long tC, String isim, String soyisim, String dogumTarihi, String dogumYeri, String yasanılanYer, int yas, boolean asiYapildiMi, boolean tasiyiciMi, boolean hastaMi) {
        super(tC, isim, soyisim, dogumTarihi, dogumYeri, yasanılanYer, yas);
        this.asiYapildiMi = asiYapildiMi;
        this.tasiyiciMi = tasiyiciMi;
        this.hastaMi = hastaMi;

    }

    public boolean isTasiyiciMi() {
        return tasiyiciMi;
    }

    public void setTasiyiciMi(boolean tasiyiciMi) {
        this.tasiyiciMi = tasiyiciMi;
    }

    public boolean isHastaMi() {
        return hastaMi;
    }

    public void setHastaMi(boolean hastaMi) {
        this.hastaMi = hastaMi;
    }

    public boolean isAsiYapildiMi() {
        return asiYapildiMi;
    }

    public void setAsiYapildiMi(boolean asiYapildiMi) {
        this.asiYapildiMi = asiYapildiMi;
    }

    @Override
    public void hastalan() {
        hastaMi = true;
    }

    @Override
    public void hastaligiTasi() {
        tasiyiciMi = true;
    }
}
