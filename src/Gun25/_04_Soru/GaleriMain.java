package Gun25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class GaleriMain {
    public static void main(String[] args) {

        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        ArrayList<Araba> galeri=new ArrayList<>();// okunan arabaları buraya dolduruyor

        for (int i = 0; i < 3; i++) {
            Araba arb=new Araba();
            System.out.print("Araba numarası = ");
            arb.arabaNo =okuInt.nextInt();
            System.out.print("Araba markası = ");
            arb.marka=okuStr.nextLine();
            System.out.print("Üretim yılı = ");
            arb.uretimYili=okuInt.nextInt();

            galeri.add(arb);

        }

        arabalarYazdir(galeri);
        uretimOrtalamasiYazdir(galeri);
    }

    public static void arabalarYazdir(ArrayList<Araba> galeri){
        for (Araba arb : galeri)
            System.out.println(arb.arabaNo+" "+arb.marka+" "+arb.uretimYili);
    }

    public static void uretimOrtalamasiYazdir(ArrayList<Araba>galeri){
        int toplamYil=0;
        for (Araba arb : galeri)
            toplamYil=toplamYil+arb.uretimYili;

        int ort=toplamYil/ galeri.size();
        System.out.println("ort = " + ort);
    }


}
