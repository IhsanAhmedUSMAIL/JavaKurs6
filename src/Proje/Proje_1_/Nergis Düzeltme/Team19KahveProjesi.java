package Proje;

import java.util.Scanner;

public class Team19KahveProjesi { public static void main(String[] args) {

    Scanner oku = new Scanner(System.in);

    String secim;
    System.out.println("Hangi Kahveyi İstersiniz ? = ");
    System.out.println("1.Türk kahvesi" + "\n" + "2.Filtre Kahve" + "\n" + "3.Espresso");

    do {

        System.out.print("Seçiminiz = ");

        secim = oku.nextLine();

        if (secim.equalsIgnoreCase("Turk kahvesi"))
            System.out.println("Turk kahvesi hazirlaniyor...");


        else
        if (secim.equalsIgnoreCase("Filtre kahve"))
            System.out.println("Filtre Kahveniz Hazırlanıyor ...");

        else
        if (secim.equalsIgnoreCase("Espresso"))
            System.out.println("Espresso kahveniz hazırlanıyor ...");

        else
            System.out.println("Geçersiz seçim, lütfen tekrar deneyiniz");

    }
    while (!secim.equalsIgnoreCase("Turk kahvesi") && !secim.equalsIgnoreCase("Espresso")&&!secim.equalsIgnoreCase("Filtre kahve"));
    System.out.println("Süt eklemek istermisiniz ?" + "\t" + "(Evet veya Hayır olarak cevaplayınız)");
    System.out.print("Süt seçiminiz = ");

    Scanner read = new Scanner(System.in);
    String sutSecimi = read.nextLine();

    {
        if (sutSecimi.equalsIgnoreCase("EVET"))
            System.out.println("Süt ekleniyor");
        else
            System.out.println("Süt eklenmiyor");
    }


    System.out.println("Şeker ister misiniz ?" + "\t" + "(Evet veya Hayır olarak cevaplayınız)");
    System.out.print("Şeker seçiminiz = ");
    String sekerSecimi = oku.next();

    if (sekerSecimi.equalsIgnoreCase("Evet")) {
        System.out.print("Kaç şeker istersiniz = ");
        Scanner kacSeker = new Scanner(System.in);
        int miktar = kacSeker.nextInt();

        System.out.println(miktar + " " + "şeker ekleniyor");}

    else{
        System.out.println("Şeker eklenmiyor ");}



    System.out.println("Hangi boyutta olsun? (Büyük boy - Orta boy - Küçük boy)");
    System.out.print("Boyut seçiminiz = ");

    Scanner oku2=new Scanner(System.in);
    String boy = oku2.nextLine();

    if (boy.equalsIgnoreCase("Büyük boy")){
        System.out.println(secim+" "+boy + " " + "kahveniz hazırlanıyor. Afiyet olsun!");}
    else
    if (boy.equalsIgnoreCase("Orta boy")){
        System.out.println(secim+" "+boy + " " + "kahveniz hazırlanıyor. Afiyet olsun!");}
    else
    if (boy.equalsIgnoreCase("Küçük boy")){
        System.out.println(secim+" " +boy + " " + "Kahveniz hazırdır. Afiyet olsun!");}

    else{
        System.out.println("Hatalı seçim");}



}
}

