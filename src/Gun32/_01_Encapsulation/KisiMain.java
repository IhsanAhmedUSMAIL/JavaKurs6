package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        kisi1.ad="Ihsan";
        kisi1.Soyad="USMAIL";
        // kisi1.yas=-25; hatanın önüne geçilmesi
        kisi1.yasAta(-25);

        System.out.println(kisi1.getad());
        System.out.println(kisi1.getSoyad());
        System.out.println(kisi1.yasVer());

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gönderme ve alma
        // işlemine Encapsulation denir.
    }
}
