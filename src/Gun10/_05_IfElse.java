package Gun10;

import java.util.Scanner;

public class _05_IfElse {

    public static void main(String[] args) {

        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi (büyük veya küçük) geçiyorsa ekrana evet yazdırın değilse
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");

        String cumle=oku.nextLine();

        if (cumle.toLowerCase().contains("study") && cumle.length() >10)
            System.out.println("EVET");
        else
            System.out.println("HAYIR");

    }

}
