package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Soru {

    public static void main(String[] args) {

        // kullanıcılardan alacağınız sayılarla dolduracağınız 6 elemanlı (sayı) bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye(listeye)(ArrayList) atayarak yazdırınız.

        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz = ");
            dizi[i] = oku.nextInt();
        }

        System.out.println("dizi = " + Arrays.toString(dizi)); // dizi yi Array listesine yazdırdık

        ArrayList<Integer> tekler=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {

            if(dizi[i] % 2 != 0 )
                tekler.add(dizi[i]);
        }
        System.out.println("tekler = " + tekler);

        /*************************************************/
        // 2. yöntem
        tekler.clear();
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz = " );
            dizi[i] = oku.nextInt();

            if (dizi[i] %2 !=0)
                tekler.add(dizi[i]);
        }
        System.out.println("tekler = " + tekler);
    }

}
