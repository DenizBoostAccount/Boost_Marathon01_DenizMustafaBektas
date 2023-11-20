package entity;

public class Saglik {

    private  NormalInsan[] asililarListesi = new NormalInsan[100];
    private  NormalInsan[] tedaviEdilenlerListesi = new NormalInsan[100];
    private static int asililarIndexi;
    private static int tedaviEdilenlerIndexi;

    public void asilamaYap(Insan insan){
        if(insan instanceof NormalInsan){
            NormalInsan normalInsan = (NormalInsan)insan;
            if(normalInsan.isAsiYapildiMi() == false && normalInsan.isTasiyiciMi() == true){
                normalInsan.setAsiYapildiMi(true);
                asililarListesi[asililarIndexi] = normalInsan;
                asililarIndexi++;
            }
        }
    }

    public NormalInsan[] asililarListesiniGöster(){
        NormalInsan[] normalInsans = new NormalInsan[asililarIndexi];
        for(int i = 0; i < asililarListesi.length; i++){
            if(asililarListesi[i] != null)
                normalInsans[i] = asililarListesi[i];
        }
        return normalInsans;
    }
    public void tedaviEt(Insan insan){
        if(insan instanceof NormalInsan normalInsan){
            if(normalInsan.isHastaMi() == true){
                normalInsan.setHastaMi(false);
                tedaviEdilenlerListesi[tedaviEdilenlerIndexi] = normalInsan;
                tedaviEdilenlerIndexi++;
            }
        }
    }
    public NormalInsan[] tedaviEdilenlerListesiniGöster(){
        NormalInsan[] normalInsans = new NormalInsan[tedaviEdilenlerIndexi];
        for(int i = 0; i < tedaviEdilenlerListesi.length; i++){
            if(tedaviEdilenlerListesi[i] != null)
                normalInsans[i] = tedaviEdilenlerListesi[i];
        }
        return normalInsans;
    }

    public NormalInsan[] getAsililarListesi() {
        return asililarListesi;
    }


    public static int getAsililarIndexi() {
        return asililarIndexi;
    }

    public NormalInsan[] getTedaviEdilenlerListesi() {
        return tedaviEdilenlerListesi;
    }



    public static int getTedaviEdilenlerIndexi() {
        return tedaviEdilenlerIndexi;
    }






}
