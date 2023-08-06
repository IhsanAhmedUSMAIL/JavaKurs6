package Gun34._03_Soru;

public class OkulMain {
    public static void main(String[] args) {

        LiseOgrencisi lo1=new LiseOgrencisi("Ihsan",  "Sayısal");
        LiseOgrencisi lo2=new LiseOgrencisi("Adil", "Müzik");
        IlkOgrencisi io1=new IlkOgrencisi("Adil","Güzel sanatlar");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io1 = " + io1);

        // Lise ve ilk öğretimin ID lerini ayırmak istersek.
        // ilkOgrencisi dosyasına private static int ilkSayaID=1; komutunu ekleyebilirsin.
        // liseOgrencisi dosyasına private static int liseSayaID=1;

    }
}
