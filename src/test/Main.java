package test;

import entity.Doktor;
import entity.Kurum;
import entity.NormalInsan;
import entity.Saglik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NormalInsan n1 = new NormalInsan(2542868,"Deniz","Bektas","10/07/1997","Mersin","Mersin",26,false,true,false);
        NormalInsan n2 = new NormalInsan(2532858,"Sevgi","Bektas","05/04/1994","Mersin","Mersin",29,false,true,false);
        NormalInsan n3 = new NormalInsan(2532848,"Nazif","Bektas","05/04/1968","Mersin","Mersin",55,false,false,true);
        NormalInsan n4 = new NormalInsan(2532158,"Suna","Bektas","07/02/1968","Mersin","Mersin",55,false,false,true);
        Doktor d1 = new Doktor(2345779,"Orhan","Hızyeter","10/05/1969","Mersin","Mersin",56,"Gazi Üniversitesi", Kurum.MERSIN_SEHIR_HASTANESİ,"Mikrobiyoloji",true);

        n1.hastalan();
        n3.hastaligiTasi();
        Saglik s1 = new Saglik();
        s1.asilamaYap(n1);
        s1.asilamaYap(n2);
        s1.asilamaYap(n3);

        s1.asilamaYap(d1);

        s1.tedaviEt(n3);
        s1.tedaviEt(n4);
        s1.tedaviEt(n1);


        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("******Uygulamaya Hoşgeldiniz...******");
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            System.out.println("0-Cıkıs");
            System.out.println("1-Ası yapılan insanları göster");
            System.out.println("2-Tedavi edilen insanları göster");
            int secim = input.nextInt();
            switch (secim){
                case 0 :
                    System.out.println("Programdan çıkılıyor....");
                    System.exit(2);
                    break;
                case 1 :
                    System.out.println("Aşı yapılanlar listesi: ");
                    for(int i = 0; i < s1.asililarListesiniGöster().length; i++){
                        System.out.println(s1.asililarListesiniGöster()[i].getIsim() + " " + s1.asililarListesiniGöster()[i].getSoyisim() + " " + s1.asililarListesiniGöster()[i].gettC() + " ");
                    }break;
                case 2 :
                    System.out.println("Tedavi edilenler listesi: ");
                    for(int i = 0; i < s1.tedaviEdilenlerListesiniGöster().length; i++){
                        System.out.println(s1.tedaviEdilenlerListesiniGöster()[i].getIsim() + " " + s1.tedaviEdilenlerListesiniGöster()[i].getSoyisim() + " " + s1.tedaviEdilenlerListesiniGöster()[i].gettC() + " ");
                    }break;
                default:
                    System.out.println("Lütfen geçerli bir işlem giriniz");

            }
        }








    }
}
