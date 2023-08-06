package Gun10Odev5;

import java.util.Scanner;

public class _02_SoruOdv5 {

    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku=new Scanner(System.in);
        System.out.print("Aralıklarla yan yana üç sayı giriniz = ");

        String sayi=oku.nextLine();

        int ilkRakam=sayi.indexOf(" ");
        String birinciRakam=sayi.substring(0,ilkRakam);
        int birinciSayi=Integer.parseInt(birinciRakam);

        int sonBosluk=sayi.lastIndexOf(" ");
        String ikinciRakam=sayi.substring(ilkRakam+1,sonBosluk);
        int ikinciSayi=Integer.parseInt(ikinciRakam);

        String ucuncuRakam=sayi.substring(sonBosluk+1);
        int ucuncuSayi=Integer.parseInt(ucuncuRakam);

        System.out.println(" Girdiğiniz sayılar = " + "\n"+birinciRakam + "\n" +ikinciRakam + "\n" + ucuncuRakam );

        int toplam=birinciSayi+ikinciSayi+ucuncuSayi;
        System.out.print("Toplam = " +toplam);

        if (toplam%2 == 0)
            System.out.println("\n"+"SAYINIZIN TOPLAMI ÇİFT SAYI");
        else
            System.out.println("SAYINIZIN TOPLAMI TEK SAYI");








    }

}
