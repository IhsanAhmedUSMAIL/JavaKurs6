package Gun30._01_staticVariables.Ornek1;

public class Okul {

    public static void main(String[] args) {

        //Ogrenci ogr1 = new Ogrenci("Ihsan", "USMAIL","Yıldırım İlkokulu");
        //Ogrenci ogr2 = new Ogrenci("Eman","OMER", "Yıldırım İlkokulu");
        //Ogrenci ogr3 = new Ogrenci("Adil","USMAIL", "Yıldırım İlkokulu");

        //.....
        //.....

        //Ogrenci ogr499=new Ogrenci("Amir","JEMAL","Yıldırım İlkokulu");
        //Ogrenci ogr500=new Ogrenci("Amal","JEMAL","Yıldırım İlkokulu");

        Ogrenci ogr1 = new Ogrenci("Ihsan","USMAIL");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd="Atatürk İlkokulu";
        System.out.println("ogr1 tekrar = " + ogr1);

        //Aynı verinin çok kez girişi engellendi
        //Aynı verinin hafızasında  NESNE sayısı kadar tekrarlanması engellendi.

    }

}
