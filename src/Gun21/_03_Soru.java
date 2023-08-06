package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Soru {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz


        Scanner okuStr=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);

        ArrayList<Integer> notlar=new ArrayList<>();
        int toplam=0;
        String cevap="";

        do {
            System.out.print("Not giriniz = ");
            int not=okuInt.nextInt();
            notlar.add(not);
            toplam=toplam+not;

            System.out.print("Devam etmek istiyor musunuz ? (E/H) " );
            cevap= okuStr.next();

        } while (cevap.equalsIgnoreCase("E")); // döngünün devam şartı
        // öğretmenin istediği notlar girildi

        // ortalama bulundu
        double ort= toplam/ notlar.size();
        System.out.println("ort = " + ort);

        int gecenSayisi=0; // geçen sayisibulundu
        for (int i = 0; i < notlar.size(); i++) {

            if (notlar.get(i) >= ort)
                gecenSayisi++;
        }
        System.out.println("gecenSayisi = " + gecenSayisi);
    }

}
