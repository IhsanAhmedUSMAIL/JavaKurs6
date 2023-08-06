package Gun19;

public class _04_JavaMethod {

    // metodları yazılabileceği yer

    public static void main(String[] args) { // ana metod, diğer metodlar buranın içinde çağırılınca çalışacaklar
        int enb=Math.max(5,6); // max metodu değer/ler almış, geriye büyük olanı vermiş
        double rndSayi=Math.random(); // hiç bir şey almıyor, sadece veriyor

        System.out.println("Merhaba Dünya"); // veri alıyor, götürüp ekrana yazıyor
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanımı kolay, çağırılması kolay, tekrar tekrar kullanabilirsin
        merhabaYaz(); // mainin daha kolay anlaşılabilir olur. temiz kod sistemi
        merhabaYaz(); // fonksiyonu çağırma şekli
    }
    // metodları yazılabileceği yer

    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya : metoddan");
    }
}
