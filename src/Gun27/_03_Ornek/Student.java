package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {

    String name; //2. Adım
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();
    public void dersYazdir() {

        System.out.println("\n*** Transkript ***");
        System.out.println("Sayın, "+name);
        System.out.println("Aldığınız dersler");

        for (Lesson d : this.dersleri)
            System.out.println(d.name+"-"+d.saat+" "+"Kredi");

    }
    public static void universiteKurallari()
    {
        System.out.println("Kural 1: çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2:uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3:Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4:En başta verdiğin sözü unutma, şuan kamptasın ");
        System.out.println("Kural 5:İn Şa Allah bu işi başaracağız.");
        System.out.println("Tekrarsız derse gelme");
        System.out.println("kendi hatamı bulan kraldır");
    }

}
