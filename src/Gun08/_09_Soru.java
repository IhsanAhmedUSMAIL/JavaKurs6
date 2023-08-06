package Gun08;

import java.util.Scanner;

public class _09_Soru {

    public static void main(String[] args) {

        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        // true veya false

        Scanner number=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = " + number);

        int rakam= number.nextInt();

        int kalan = rakam%2; // 1 ise tektir

        boolean tekMi= (kalan==1);
        System.out.println("tekMi = " + tekMi);







    }

}
