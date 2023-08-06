package Proje.Proje_2_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class onlineGrocery {

    public static void main(String[] args) {

        String[] urunIsimleri = {"Elma", "Armut", "Çilek","Mango"};
        double[] urunFiyatlari = {9.90, 5, 5.99, 8.90};
        int [] urunStoklari = {10,8,17,12};

        Scanner oku=new Scanner(System.in);
        List<String> secilenUrunler = new ArrayList<>();
        List<Integer> secilenMiktarlar = new ArrayList<>();

        String devam;

        do {
            System.out.println("Alışveriş Listesi:");
            for (int i = 0; i < urunIsimleri.length; i++) {
                System.out.println((i+1)+"."+urunIsimleri[i]+"-Fiyat"+" "+urunFiyatlari[i]+" "+"Tl/Kg - Stok:"+urunStoklari[i]+" "+"Kg");
            }

            System.out.print("Lütfen alışveriş yapmak istediğiniz ürün numarasını giriniz:");
            int secim= oku.nextInt();
            oku.nextLine();

            if (secim>=1 && secim<=urunIsimleri.length) {
                secilenUrunler.add(urunIsimleri[secim-1]);

                System.out.print("Lütfen miktarını giriniz (Kg): ");
                int miktar = oku.nextInt();
                oku.nextLine();
                secilenMiktarlar.add(miktar);
            } else {
                System.out.println("Geçersiz bir seçim yaptınız.");
            }

            System.out.println("Alışverişe devam etmek istiyor musuuz ? (Evet / Hayır)");
            devam = oku.nextLine();

        }while (devam.equalsIgnoreCase("Evet"));

        double toplamFiyat = 0.0;
        boolean stokYetersiz = false;
        for (int i=0; i< secilenUrunler.size(); i++) {
            String secilenUrun = secilenUrunler.get(i);
            int secilenMiktar = secilenMiktarlar.get(i);
            int urunIndex = -1;
            for (int j = 0; j < urunIsimleri.length; j++) {
                if (urunIsimleri[j].equals(secilenUrun)) {
                    urunIndex = j;
                    break;
                }
            }
            if (urunIndex != -1) {
                if (urunStoklari[urunIndex] >= secilenMiktar) {
                    double toplamUrunFiyati = urunFiyatlari[urunIndex]*secilenMiktar;
                    toplamFiyat += toplamUrunFiyati;
                    urunStoklari[urunIndex] -= secilenMiktar;
                } else {
                    stokYetersiz=true;
                    System.out.println(secilenUrun+"ürünün stokları yetersiz. Eksik miktar: "+(secilenMiktar-urunStoklari[urunIndex]));
                    urunStoklari[urunIndex] = 0;
                }

            }
            System.out.println("Alışveriş özeti");
            System.out.println("Ürünler"+secilenUrunler+"\n"+"Miktar"+secilenMiktarlar+" Kg"+"\n"+toplamFiyat+" tl");

        }
    }
}
