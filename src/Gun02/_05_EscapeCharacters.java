package Gun02;

import java.lang.ref.SoftReference;

public class _05_EscapeCharacters {
    public static void main(String[] args) {

        // \n  -> yeni satır aç, alt satıra geçer
        // \t  -> tab tuşuna bas, 2,3 harflık boşluk oluşturuyor
        // \b  -> backspace etkisi oluşturur, yani bir karakter geri siler
        // \ " -> tırnak yazdırmak için kullanılır
        // \\  -> ekrana bir tane \ yazar
        // \r  -> satır başına git

        System.out.println("MerhabaDünya"); // MerhabaDünya
        System.out.println("Merhana\nDünya"); // Merhaba Yazar, Sonra alt satıra geçer Dünya Yazar
        System.out.println("Merhaba\tDünya"); // Merhaba  Dünya (tab tuşu kadar boşluk)
        System.out.println("Merhaba\bDünya"); // MerhabDünya
        System.out.println("Merhaba\b\bDünya"); // MerhaDünya
        System.out.println("Merhaba\"Dünya"); // Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); // Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); // Dünya

    }
}
