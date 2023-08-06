package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZoneDateTime {
    public static void main(String[] args) {

        ZonedDateTime zdt= ZonedDateTime.now();
        // şu anda benim bulunduğum yerin default zamanını verir
        // LocalDateTime.now() gibi saat olarak
        // diğer zonlar için ZoneDateTime.now(ZoneID);

        System.out.println("zdt = " + zdt);
        // zdt = 2023-07-20T21:04:53.668+03:00[Asia/Istanbul]
        // Asia/Istanbul : ZoneId

        // Locale.getAvailableLocales(); gibi
        Set<String> zamanZoneIdleri= ZoneId.getAvailableZoneIds();

        for(String z : zamanZoneIdleri)
        {
        if (!z.toLowerCase().contains("bul"))
            continue;

            System.out.println("z = " + z);
        }

        ZoneId zoneIdIstanbul=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zoneIstanbul= ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("zoneIstanbul = " + zoneIstanbul);


    }
}
