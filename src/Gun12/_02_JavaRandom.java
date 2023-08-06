package Gun12;

import java.util.Scanner;

public class _02_JavaRandom {

    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        // kullanıcı bilirse tebrikler yazdırınız
        // 5 girersem 5 e kadar sayı üretsin, ben tahmin etmeye çalışayım

        Scanner oku=new Scanner(System.in);
        System.out.print("Üretilecek sayı sınırı = ");

        int sinir= oku.nextInt();

        int tutulanSayi= (int) (Math.random()*sinir); // 6 tutarsa 0,1,2,3,4,5,

        System.out.print("tahmininiz = ");
        int tahmin= oku.nextInt();

        if (tutulanSayi==tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemediniz");
        System.out.println("Tutulan Sayi = " + tutulanSayi);

    }

}
