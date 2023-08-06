package Gun11;

import java.util.Scanner;

public class _06_JavaTernary {

    public static void main(String[] args) {

        // soru: girilen bir sayının sıfır mı, negatif mı, pozitif mi, olduğunuterenay operatör ile yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sayi=oku.nextInt();

        System.out.println((sayi==0) ? "Sıfır" : (sayi>0) ? "Pozitif" : "Negatif");

    }

}
