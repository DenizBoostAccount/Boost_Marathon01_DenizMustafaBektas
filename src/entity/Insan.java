package entity;

public abstract class Insan {
    private long tC;
    private String isim;
    private String soyisim;
    private String dogumTarihi;
    private String dogumYeri;
    private String yasanılanYer;
    private int yas;

    public Insan(long tC, String isim, String soyisim, String dogumTarihi, String dogumYeri, String yasanılanYer, int yas) {
        this.tC = tC;
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.dogumYeri = dogumYeri;
        this.yasanılanYer = yasanılanYer;
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public long gettC() {
        return tC;
    }

    public void settC(long tC) {
        this.tC = tC;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public String getYasanılanYer() {
        return yasanılanYer;
    }

    public void setYasanılanYer(String yasanılanYer) {
        this.yasanılanYer = yasanılanYer;
    }


}
