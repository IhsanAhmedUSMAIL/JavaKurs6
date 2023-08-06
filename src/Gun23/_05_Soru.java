package Gun23;

import java.util.Arrays;
import java.util.TreeSet;

public class _05_Soru {

    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10(dahil)) a kadar olan sayılarla doldurduktan, tekrarlı değerleri almayacak
        // şekilde yeni bir diziye atınız.

        Integer[] dizi=new Integer[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]= (int) (Math.random()*11); //MyFunc.rndTamSayi(10);
        }

        System.out.println("dizi = " + Arrays.toString(dizi));

        //1. Yöntem
        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < dizi.length; i++) {
            ts.add(dizi[i]);
        }
        System.out.println("ts = " + ts);

        //2. yöntem kolay yöntem
        TreeSet<Integer> ts2=new TreeSet<>(Arrays.asList(dizi));
        System.out.println("ts2 = " + ts2);

    }

}
