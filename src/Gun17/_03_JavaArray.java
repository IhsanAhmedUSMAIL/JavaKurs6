package Gun17;

import java.util.Scanner;

public class _03_JavaArray {

    public static void main(String[] args) {

        // kullanıcının gireceği bir cümlede kaç kalime olduğunu bulunuz
        // Bu gun hava cok guzel ->5

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle = ");
        String cumle=oku.nextLine();

        String [] kelimeler=cumle.split(" "); // string metodu (bölüp stringe atıyor)

        System.out.println("kelimeler.length = " + kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

    }

}

   // iklimler çok değişti
   // String[] kelimeler=cumle.split(" ");
   // kelimeler[0] -> "iklimler"
   // kelimeler[1] -> "çok"
   // kelimeler[2] -> "değişti"

