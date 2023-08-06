package Gun07Odev3;

import java.util.Scanner;

public class _17_SoruOdv3 {

    public static void main(String[] args) {

        // tek seferde girilen 3 kelimelik ismi,        ad , 2.ad ve soyadını      A.E.Y. şeklinde yazınız.
        //     mesala : Mehmet Alı Yılmaz -> M.A.Y

        Scanner oku=new Scanner(System.in);
        System.out.print("3 kelimelik isim giriniz = ");

        String tamIsim=oku.nextLine();

        char ilkHarf=tamIsim.charAt(0);

        int boslukIndex=tamIsim.indexOf(" ");
        char ikinciHarf=tamIsim.charAt(boslukIndex+1);

        int ikinciBosluk=tamIsim.lastIndexOf(" ");
        char ucuncuHarf= tamIsim.charAt(ikinciBosluk+1);

        System.out.println("Kısaltma = " + ilkHarf +"."+ikinciHarf+"."+ucuncuHarf);


    }

}
