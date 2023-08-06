package Gun12;

import java.util.Scanner;

public class _03_JavaRandom {

    public static void main(String[] args) {

        // (int) (Math.Random()*10) -> 0-9 arası üretir. yanı başı her zaman sıfırdır.
        //20-30 gibi belli aralıkta sayı nasıl üretiriz. min birde max lazım, alt sınır ve üst sınır

        // Girilen min ve max aralığında random sayı üreten programı yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("min. (alt sınır) = ");
        int min=oku.nextInt();

        System.out.print("max. (üst sınır) = ");
        int max= oku.nextInt();

        int rndSayi= (int)(Math.random()*(max-min))+min;

        System.out.println("rndSayi = " + rndSayi);



    }

}
