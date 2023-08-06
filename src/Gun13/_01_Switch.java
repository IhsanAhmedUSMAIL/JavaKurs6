package Gun13;

import java.util.Scanner;

public class _01_Switch {

    public static void main(String[] args) {

        // Daha önce çözdüğünüz hesap makinesi sorusunu switch ile çözünüz
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini yine kullanıcıdan alarak isteğe uygun olan
        // işlemi yaptırıp sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        System.out.print("1. Sayı = ");

        int sayi1=oku.nextInt();

        System.out.print("2.Sayı = ");

        int sayi2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Çarpma için P");
        System.out.println("Bölme için B");
        System.out.print("Seçiminiz = ");

        String tercih=okuStr.nextLine();

        switch (tercih.toUpperCase()) {
            case "T": System.out.println("toplam = " + (sayi1 + sayi2));break;
            case "Ç": System.out.println("toplam = " + (sayi1 - sayi2));break;
            case "P": System.out.println("toplam = " + (sayi1 * sayi2));break;
            case "B": System.out.println("toplam = " + ((double) sayi1 / sayi2));break;
            default: System.out.println("HATALI DEĞER");
        }





    }

}
