package Gun27._01_Ornek;

public class Utility { // SINIFIN ADI, TİPİN ADI

public  String getrString (int sayi) {

    return  String.valueOf(sayi);
    // string e çevir ver

}

// Eğer bir metod nesnenin özelliklerini kullanıyorsa
// nesne oluşturulmadan kullanılamaz. Dolayısıyla STATİC olamaz. NESNE ŞART

 public static String getString2(int sayi) {

    return String.valueOf(sayi);
     // string e çevir ver
 }

    // Bağımsız metodlar (static metodlar): herhangi bir nesneye
    // bağlı çalışması gerekmeyen metodlardır.
    // static metodlar class a veya tipe ait

}
