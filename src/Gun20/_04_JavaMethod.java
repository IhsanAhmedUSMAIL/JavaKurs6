package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        // kullanıcının gireceği sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buluundurup mainden mainde yazdırınız
        // örneğin 5 girildi ise -> 1*2*3*4*5 i bulmalısınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");

        int sinir= oku.nextInt();

        int carpim=faktoryel(sinir); // eşitlenebiliyor ise dönen var demek
        System.out.println("carpim = " + carpim);


    }
    public static int faktoryel(int sinir) {
        int carpim = 1;

        for (int i = 1; i <= sinir; i++)
            carpim = carpim * i; // 1*1 -> 1*2 -> 2*3 -> 6*4 -> 24x5 -> 120

        return carpim;

    }
}
