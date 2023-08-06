package Gun11;

import java.util.Scanner;

public class _08_JavaMath {

    public static void main(String[] args) {

        // Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku=new Scanner(System.in);

        System.out.print("a değeri = ");
        int sayi1= oku.nextInt();

        System.out.print("b değeri = ");
        int sayi2= oku.nextInt();

        System.out.print("c değeri = ");
        int sayi3= oku.nextInt();

        // sayi1,sayi2, -> enBüyük sayi3
        int enBuyuk=Math.max(sayi1,sayi2);
        int enb=Math.max(enBuyuk,sayi3);

        System.out.println("En büyük = "+enb);

        //2. yöntem

        System.out.println(Math.max(Math.max(sayi1,sayi2),sayi3));


    }

}
