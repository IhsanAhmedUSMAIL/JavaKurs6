package Gun15;

import java.util.Scanner;

public class _02_forLoop {

    public static void main(String[] args) {

        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz.
        // carpimin degeri 10000 ü geçtiğinde işlem sonlansın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sinir= oku.nextInt();
        int carpim=1;

        for (int sayac=1; sayac<=sinir; sayac++)

        {
            System.out.print("carpim = " + carpim+"*"+sayac+"->"+carpim);
            carpim=carpim*sayac;
            System.out.println("-> "+carpim);

            if (carpim>=10000)
            {
                System.out.println("break çalıştı");
                break; // bundan sonra olanlar çalışmayacak.
            }
        }
    }

}
