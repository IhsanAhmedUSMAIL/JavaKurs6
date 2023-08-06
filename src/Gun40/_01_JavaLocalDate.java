package Gun40;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate sadece gün ay yıl bilgisini tutar

        LocalDate tarih=LocalDate.now(); // şu andaki tarihi ver

        System.out.println("tarih = " + tarih);
        System.out.println("tarih = " + tarih.getYear());
        System.out.println("tarih = " + tarih.getMonth()); // ayın adı
        System.out.println("tarih = " + tarih.getMonthValue()); // kaçıncı ay olduğu
        System.out.println("tarih = " + tarih.getDayOfMonth());
        System.out.println("tarih = " + tarih.getDayOfWeek()); // günn adı
        System.out.println("tarih = " + tarih.getDayOfWeek().getValue()); // haftanın kaçıncı günü
        System.out.println("tarih = " + tarih.getDayOfYear());

        // kendisindeki hazır formatları bakalım
        System.out.println("ISO_DATE="+ tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL =" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        // windows un yerel ayarlarına göre FULL ve LONG değişiklik gösterebilir

        // istediğimiz formatta gösterim
        System.out.println("\n********** istediğimiz formatta gösterim ************");
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozetFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih = " + tarih.format(ozetFormat1));

        DateTimeFormatter oz2=DateTimeFormatter.ofPattern("dd.MM.yy");
        System.out.println("tarih dd.MM.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3=DateTimeFormatter.ofPattern("EEEE dd.MM.yy");
        System.out.println("tarih EEEE dd.MM.yy = " + tarih.format(oz3));

        DateTimeFormatter oz4=DateTimeFormatter.ofPattern("EE dd.MM.yy");
        System.out.println("tarih EE dd.MM.yy = " + tarih.format(oz4)); // üstteki satırı direk  oz4 old. paketin içine atabilirsin

        DateTimeFormatter oz5=DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yy");
        System.out.println("tarih MMMM EEEE dd.MM.yy = " + tarih.format(oz5));

        DateTimeFormatter oz6=DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM dd EEEE yyyy = " + tarih.format(oz6));
    }
}
