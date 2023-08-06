package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {

        ArrayList<Integer> matNotlari=new ArrayList<>(); // tek boyut
        ArrayList<Integer> fizNotlari=new ArrayList<>(); // tek boyut
        ArrayList<Integer> kimNotlari=new ArrayList<>(); // tek boyut

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(50);
        fizNotlari.add(60);

        kimNotlari.add(50);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        ArrayList<    ArrayList<Integer> > notlarListesi=new ArrayList<>(); // Listelerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        // Soru 1:
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 50 70 80
        // Fizik : 30 40
        // Kimya : 60 70 80 90

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.print(dersler.get(i) +" : " );
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }

            System.out.println();
        }

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // Sadece istediği derse ait notları bir mettoda yazdırınız.

        System.out.println("********* 2. Soru *********");
        Scanner oku=new Scanner(System.in);
        System.out.print("Ders no (0-Mat, 1-Fiz, 2-Kim)=");
        int dersNo= oku.nextInt();

        dersNotuYazdir( dersNo, notlarListesi);

    }

    public static void dersNotuYazdir (int dersNo, ArrayList<    ArrayList<Integer> >notlarListesi){

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {

            System.out.println(notlarListesi.get(dersNo).get(i)+"\t");
        }

    }

}
