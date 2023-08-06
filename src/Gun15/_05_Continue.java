package Gun15;

import java.util.Scanner;

public class _05_Continue {

    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana
        // alt alta olacak şekilde yazdırınız boşloklsrı yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");

        String cumle=oku.nextLine();

        // Bugün hava çok güzel -> index=0, kaça<cumle.length, 1 er

        for (int i = 0; i < cumle.length() ; i++) {

            if (cumle.charAt(i) == ' ')
                continue;

            System.out.println(cumle.charAt(i));

        }

    }

}
