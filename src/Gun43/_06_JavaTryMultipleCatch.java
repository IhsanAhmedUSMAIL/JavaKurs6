package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program başladı");

        try { // hata bölgesine şerit i çektik
            Scanner oku = new Scanner(System.in);

            System.out.print("Sayi1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayi2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

            // String kelime="";  Genel hataya düşmesi için yapıldı
            // kelime.charAt(3);

        }
        catch (ArithmeticException ex) // belirli bir hata : case
        {
            System.out.println("Sıfıra bölme hatası oluştu");
        }

        catch (InputMismatchException ex) // belirli bir hata : case
        {
            System.out.println("Lütfen sayı giriniz");
        }

        catch (Exception ex) // genel hata switch deki default gibi
        {
            System.out.println("Beklenmeyen hata oluştu");
        }



        System.out.println("program bitti");
    }
}
