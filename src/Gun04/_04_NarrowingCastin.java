package Gun04;

public class _04_NarrowingCastin {
    public static void main(String[] args) {

        int toplam=6700;
        byte sayi=5;

        sayi=(byte)toplam;  // veri kaybı olmasa bile dikkatli yapılmalı
        System.out.println("sayi = " + sayi);

        double oran=3.7; // ben tam sayi kısmını almak istiyorum
        toplam=(int)oran; // kasıtlı olarak sadece tam sayi kısmını aldım
        sayi=(byte)oran;
        System.out.println("toplam = " + toplam);
        // veri kaybı var, fakat bilerek yaptığım için sorun yok

    }
}
