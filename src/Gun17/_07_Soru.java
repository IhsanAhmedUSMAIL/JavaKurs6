package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {

    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra
        // kullanıcının gireceği bir rakamı arttırınız.
        // bu rakam var ise indexini yazdırınız

        int[] dizi=new int[10]; // 10 elemanlı bir diziyi tanımlandı

        for (int i = 0; i < 10; i++)  // diziyi random (10 dahil sayılarla) doldurduk
            dizi[i] = (int) (Math.random() * 11);

            System.out.println("dizi = " + Arrays.toString(dizi));

            Scanner oku = new Scanner(System.in);


        System.out.print("Aranacak sayı(0-10)= ");
        int arananRakam = oku.nextInt(); // kullanıcının gireceği bir

            for (int i = 0; i < dizi.length; i++) {

                if (dizi[i] == arananRakam)
                    System.out.println("Var, oda numarası(indexi) = " + i);

            }

        }

       // TODO: sadece ilk rakamın yerini versin
       // TODO: bulamadığında bulamadım desin.


    }


