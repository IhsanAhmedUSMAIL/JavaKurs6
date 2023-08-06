package Gun04;

public class _01_JavaString {
    public static void main(String[] args) {

        int sayac = 0; // int tipi, sayac adı, 0 başlangic degeri

        String ad = "Ihsan"; // kelime veya kelimeler saklayacaksan string kullanacaksin

        System.out.println("sayac = " + sayac); // 0 yazar
        System.out.println("ad = " + ad); // Ihsan yazar

        String soyad = "USMAIL";
        System.out.println("soyad = " + soyad); // USMAIL yazar

        String tamAd = ad + " " + soyad; // + işareti sayıları toplar
                                         // kelimelerde yan yana birleştirir

        System.out.println("Tam Ad = " + tamAd); //Ihsan USMAIL


    }
}
