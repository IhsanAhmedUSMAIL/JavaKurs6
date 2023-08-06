package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // girilen bir adı ekrana yazdırınız

        Scanner okuyucu=new Scanner(System.in);
        System.out.print("İsim giriniz=");
        okuyucu.next(); // next kelime okur

        System.out.println("okuyucu = " + okuyucu);
        System.out.println("bitti");

        /*

        okuyucu.next()       -> bir kelime okur
        okuyucu.nextLine()   -> tüm satırı okur cumle gibi

        okuyucu.nextInt()     -> bir tam sayı(int)
        okuyucu.nextShort()   -> bir tam sayı(short)
        okuyucu.nextByte()    -> bir tam sayı(byte)
        okuyucu.nextLong()    -> bir tam sayı(long)

         okuyucu.nextDouble() -> bir ondalıklı sayı(double)
         okuyucu.nextFloat() -> bir ondalıklı sayı(float)

         okuyucu.nextBoolean() -> true veya false girişi için


         */



    }
}
