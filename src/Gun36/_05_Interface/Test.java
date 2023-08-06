package Gun36._05_Interface;

public class Test implements IGosterir,IYazdirir {
    // Burda sadece ortak olan metodları alır
    @Override
    public void goster() {
        System.out.println("gösterdi");

    }

    @Override
    public void yazdir(String msg) {
        System.out.println("yazdırdı");

    }

    @Override
    public void yaz() {
        System.out.println("yazdırıldı");

    }

    @Override
    public int yazdirmaSayisiGoster() {
        int sayfaSayisi=5; // metod çalıştı
        return sayfaSayisi;

    }

}
