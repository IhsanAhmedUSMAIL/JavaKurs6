package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _06_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        
        // kullanıcıdan alınan ve string durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine çevrilmesi

        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih giriniz= (25 01 2023) =");
        String strTarih= oku.nextLine();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strTarih,f); // strTarih girdisini f formatına çevir demek

        System.out.println("tarih.format(f) = " + tarih.format(f));
        
    }
}
