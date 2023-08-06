package Gun26._01_Ornek;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci();
        ogr1.okulNo=1001;
        ogr1.ad="Adil";
        ogr1.soyad="USMAIL";

        ogr1.okul= new Okul();
        ogr1.okul.okulAd="Bayrak okulu";
        ogr1.okul.okulMudurAd="Selim Özel";
        ogr1.okul.adres="Ümraniye/İST";

        System.out.println("ogr1.ad = " + ogr1.ad);
        System.out.println("ogr1.okul.okulAd = " + ogr1.okul.okulAd);


    }
}
