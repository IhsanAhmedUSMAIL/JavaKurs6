package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        //tipi    adı     başlangıç değeri
          int     sayi =  5;

        Scanner  okuyucu = new Scanner(System.in); // sadece yanıp sonen işareti göreceksin o yüzden alttaki sop ekledik.
        //tipi    adı      yeni bir tane okuyucu oluştur(klavyeden veya konsoldan)

        System.out.print("sayi giriniz=");
        int okunan=okuyucu.nextInt(); // klavyeden girilen tam sayiyi oku
        // rakam girilip entra basıldığında değeri alıp okunan a atıyor.

        System.out.println("okunan = " + okunan);
        System.out.println("bitti");

    }
}
