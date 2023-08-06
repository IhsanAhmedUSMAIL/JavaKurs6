package Gun17;

import java.util.Scanner;

public class _02_JavaArray {

    public static void main(String[] args) {

        // kullanıcının gireceği bir cümlede kaç kalime olduğunu bulunuz
        // for döngüsü ile yapalım
        // Bu gun hava cok guzel ->5

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle giriniz = ");
        String cumle= oku.nextLine();
        int boslukSayisi=0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == ' ')
                boslukSayisi++;
        }

        System.out.println("Kelime sayısı = " + (boslukSayisi+1));

    }

}
