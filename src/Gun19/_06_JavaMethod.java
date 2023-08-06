package Gun19;

import java.util.Scanner;

public class _06_JavaMethod {
    public static void main(String[] args) {

        // bir sayının tek mı çift mi olduğunu yazdırınız.

        int sayi=55;

        if (sayi %2 == 0)
            System.out.println("Çift");
        else
            System.out.println("Tek");

        tekMiCiftMi(55);
        tekMiCiftMi(60);
        okuTekMiCiftMiYaz();

    }
    public static void tekMiCiftMi(int sayi)
    {
        if (sayi %2 == 0)
            System.out.println("m:Çift");
        else
            System.out.println("m:Tek");
    }
    public static void okuTekMiCiftMiYaz()
    {
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");

        int sayi= oku.nextInt();

        tekMiCiftMi(sayi);

      //  if (sayi%2==0)
      //      System.out.println("m:çift");
       // else System.out.println("m: tek");
    }
}
