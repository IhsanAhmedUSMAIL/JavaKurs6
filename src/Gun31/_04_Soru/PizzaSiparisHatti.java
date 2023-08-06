package Gun31._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparisler=new ArrayList<>();

        int secim=0;
        do {
            menu();// menuyu göster
            secim= oku.nextInt(); // secimi oku
            // secime göre pizzayı Arrayliste ekle

            switch (secim) {
                case 1: Pizza ps=new Pizza(PizzaSize.Small);
                siparisler.add(ps);
                break;
                case 2: Pizza pm=new Pizza(PizzaSize.Medium);
                siparisler.add(pm);
                break;
                case 3: Pizza pl=new Pizza(PizzaSize.Large);
                siparisler.add(pl);
                break;
                case 4: siparisiYazdir(siparisler);
                break;
            }

        } while (secim<5);

    }

    public static void siparisiYazdir(ArrayList<Pizza>siparisler)
    {
        int s=0, m=0, l=0;
        for (Pizza p: siparisler)
        {
        switch (p.size)
        {
            case Small: s++; break;
            case Medium: m++; break;
            case Large: l++; break;
        }

        }

        System.out.println(s+" tane small Pizza");
        System.out.println(m+" tane Medium Pizza");
        System.out.println(l+" tane Large Pizza");
    }
    public static void menu ()
    {
        System.out.println("******* Pizza Menu *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al-Siparişi göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seçiminiz =");
    }
}
