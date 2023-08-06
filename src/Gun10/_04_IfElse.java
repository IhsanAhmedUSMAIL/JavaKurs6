package Gun10;

import java.util.Scanner;

public class _04_IfElse {

    public static void main(String[] args) {

        // girilen bir sayı pozitif ve tek ise ekrana uygun sayı girildi
        // değilse uygun sayı girilmedi şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi>0 )
            System.out.println("Uygun sayı girildi");
        else
            System.out.println("Uygun sayı girilmedi");

    }

}
