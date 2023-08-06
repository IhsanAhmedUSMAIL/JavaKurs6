package Gun06;

import java.util.Scanner;

public class _08_Soru {

    public static void main(String[] args) {

        // Girilen bir ad soyadı örneğin "Ihsan USMAIL" I.U. şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Adınızı ve soyadınızı giriniz = ");

        String adSoyad=oku.nextLine();
        char ilkHarf=adSoyad.charAt(0);

        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkharf=adSoyad.charAt(boslukIndex+1);

        System.out.println("Adınızın ve soyadınızın ilk harfi =" + ilkHarf+"." +soyadIlkharf+".");


    }

}
