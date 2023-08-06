package Gun09;

import java.util.Scanner;

public class _02_JavaIf {

    public static void main(String[] args) {

        // Girilen bir sayının negatif mi, pozitif mi olduğunu yazdırınız.
        // sıfır ise sıfır yazdırınız

        Scanner read=new Scanner(System.in);
        System.out.print("Sayi giriniz = ");

        int sayi= read.nextInt();

        if (sayi>0)
            System.out.println("Pozitif");

        if (sayi==0) //sadece bir = olsaydı atama anlamına iki = olması durumunda sormak anlamına
            System.out.println("Sıfır");

        if (sayi<0)

            System.out.println("Negatif");


    }

}
