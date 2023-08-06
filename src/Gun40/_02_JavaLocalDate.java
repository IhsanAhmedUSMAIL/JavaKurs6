package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate sadece gün ay yıl bilgisini tutar

        LocalDate tarih=LocalDate.now(); // şu andaki tarihi ver

        DateTimeFormatter oz6=DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM dd EEEE yyyy = " + tarih.format(oz6));

        System.out.println("*** başka dilde formatta gösterimi ***");
        // lokalden aldığım tarihi başka dilde formatta gösterimi
        System.out.println("Almanca Tarih=" + tarih.format(oz6.withLocale(Locale.GERMAN)));

        // Lokalizasyon tanımlaması ne demek
        // en-US : Amerikanı nın ingilizce konuşulan lokalizasyonu (Bölgesi)
        // en-UK : İngiltere nin ingilizce konuşulan lokalizasyonu (Bölgesi)
        // fr-CA : kanada nın fransızca konuşulan lokalizasyonu (Bölgesi)
        // en-CA : kanada nın ingilizce konuşulan lokalizasyonu (Bölgesi)
        // tr-TR : Türkiyenin Türkçe konuşulan lokalizasyonu (Bölgesi)

        Locale lCince = new Locale("zh","CH"); // Çinin zh konuşulan bölgesi
        System.out.println("Çince Tarih="+tarih.format(oz6.withLocale(lCince)));

        // Kullanılabilir Local leri bulma

        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();
        for (Locale l : kullanilabilirLokaller) {

            if (!l.getDisplayCountry().toLowerCase().contains("tr")) continue;

            System.out.print("Dili="+l.getDisplayLanguage());
            System.out.print("Ülkesi="+ l.getDisplayCountry());
            System.out.print("Dili="+l.getLanguage());
            System.out.print(", ülkesi"+l.getLanguage());
            System.out.println();
        }

        Locale lEthiopia=new Locale("tr","TR");
        System.out.println("Türkiye Tarih=" + tarih.format(oz6.withLocale(lEthiopia)));

        // tarih=2053-5-20; gibi kendimiz bir tarihi nasıl set ederiz
        LocalDate tarih1=LocalDate.of(2023,5,20);
        LocalDate tarih2=LocalDate.of(2023, Month.MAY,20);
        System.out.println("tarih2.format(oz6) = "+tarih2.format(oz6));
    }
}
