package Gun06;

import java.util.Scanner;

public class _02_Ornek {

    public static void main(String[] args) {

        //kullanıcıdan cadde(String), sokak(String), postakodu (int) ve ülke şeklinde (String)
        // ev sahibi misiniz (String) şeklinde adres bilgisini alarak yazdırınız

        Scanner okuStr= new Scanner(System.in);
        Scanner okuInt= new Scanner(System.in);
        Scanner okuBool= new Scanner(System.in);

        System.out.print("Cadde = ");
        String cadde=okuStr.nextLine();

        System.out.print("Sokak = ");
        String sokak=okuStr.nextLine();

        System.out.print("Posta kodu =");
        int pk=okuInt.nextInt();

        System.out.print("Ülke = ");
        String ulke=okuStr.nextLine();

        System.out.print("Ev sahibi(t/f)=");
        boolean evSahibiMi=okuStr.nextBoolean();

        System.out.print("Adres="+cadde+" "+sokak+" "+pk+" "+ulke+" "+evSahibiMi);



    }

}
