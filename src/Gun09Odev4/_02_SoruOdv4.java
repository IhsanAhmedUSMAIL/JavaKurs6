package Gun09Odev4;

import java.util.Scanner;

public class _02_SoruOdv4 {

    public static void main(String[] args) {

        // Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bularak,
        // 50 ve yukarısında ise geçtiniz , altında ise kaldınız yazdırınız.

        Scanner IntOku=new Scanner(System.in);
        System.out.print("Vize notu = ");

        int vize=IntOku.nextInt();

        System.out.print("Final notu = ");

        int not2=IntOku.nextInt();

        double ortalama=((double) (0.4*vize)+(0.6*not2));

        System.out.println("ortalama = " + ortalama);

        if (ortalama>=50)
            System.out.println("Tebrikler geçtiniz");

        if (ortalama<50)
            System.out.println("Üzgünüm kaldınız");





    }

}
