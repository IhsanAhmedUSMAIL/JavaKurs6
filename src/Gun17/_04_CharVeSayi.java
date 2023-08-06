package Gun17;

public class _04_CharVeSayi {

    public static void main(String[] args) {

        // A hava A: bilgisayar için her şey sayı
        // Bilgisayarın charakterler ile sayıların karşılaştırdığı tablo var
        // Karakter ve sayıların eşileştirildiği farklı tablolar var genelde yaydın olan ascii tablodur
        // A->65, 65 E SAKLIYOR
        // 65->A, A yazıyor
        // bu tabloya ascii denir.

        int sayi=65;
        System.out.println("sayi = " + sayi);

        char harf=(char) 65;
        System.out.println("harf = " + harf);

        //ascii tablosu
        for (int i = 0; i <= 255; i++) {

            harf=(char) i;
            System.out.println(i+" nolu harf = " + harf);

        }

    }

}
