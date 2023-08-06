package Gun11;

import java.util.Scanner;

public class _02_Soru {

    public static void main(String[] args) {

        // Otopark ücretleri ;
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den büuük ise 20 tl dir
        // kullanıcının kaç saat kaldığını alarak ücreti yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç saat park ettiniz = ");

        int saat=oku.nextInt();

        if (saat<=3)
            System.out.println("Otopark ücretiniz 10 tl");
        else // saat>3
        if (saat<=5)
            System.out.println("otopark ücretiniz 15 tl");
        else
            System.out.println("otopark ücretiniz 20 tl");

        //2. yöntem

        System.out.println((saat<=3) ? "10 tl" : (saat<=5) ? "15 tl" : "20 tl");


    }

}
