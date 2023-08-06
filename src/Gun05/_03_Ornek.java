package Gun05;

import java.util.Scanner;

public class _03_Ornek {

    public static void main(String[] args) {

        // kullanıcıdan adını ve soyadını alarak ekrana yazdırınız

        Scanner oku=new Scanner(System.in); // okuma işlemini yapacak olan değişkeni tanımlar

        System.out.print("Adınız ve Soyadınız");
        String adSoyad = oku.nextLine(); // okuma işlemi bu noktada yapılıyor (next olmasaydi sadece ilk kelimeyi alır)

        System.out.println("adSoyad = " + adSoyad); // verinin gerçekten okunabildiğini
        // tekrar ekrana yazarak kontrol ettim.
        System.out.println("bitti");

    }
}
