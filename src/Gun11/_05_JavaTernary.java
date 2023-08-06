package Gun11;

import java.util.Scanner;

public class _05_JavaTernary {

    public static void main(String[] args) {

        // Otopark ücretleri ;
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den büuük ise 20 tl dir
        // kullanıcının kaç saat kaldığını alarak ücreti yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Park sürenizi giriniz = ");

        int saat= oku.nextInt();

        //1. yöntem

        String fiyatStr=((saat<=3) ? "10 tl": (saat<=5) ? "15 tl" : "20 tl");
        System.out.println("fiyatStr = " + fiyatStr);

        //2. yöntem

        System.out.println((saat<=3) ? "10 tl": (saat<=5) ? "15 tl" : "20 tl");


    }
}
