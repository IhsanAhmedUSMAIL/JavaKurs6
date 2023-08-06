package Gun40;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _03_JavaLocalTime {
    public static void main(String[] args) {

        // LocalTime : Tarih bilgisi içermez sadece saat, dak, san, nano sn içerir.

        LocalTime saat= LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour"+saat.getHour());
        System.out.println("saat.getMinute"+saat.getMinute());
        System.out.println("saat.getSecond"+saat.getSecond());
        System.out.println("saat.getNano"+saat.getNano());

        // kendimiz özel format verelim
        DateTimeFormatter of1=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat hh:mm:ss = " + saat.format(of1));

        DateTimeFormatter of2=DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("saat kk:mm = " + saat.format(of2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("saat hh:mm a = " + saat.format(of3));

        /**********************************/

        LocalTime saat1= LocalTime.of(7,34,45); // saat bilgisi set etme
        System.out.println("saat1.format(of3) = "+saat1.format(of3));

    }
}
