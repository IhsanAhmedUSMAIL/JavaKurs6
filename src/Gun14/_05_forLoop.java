package Gun14;

import java.util.Scanner;

public class _05_forLoop {

    public static void main(String[] args) {

        // kullanıcının gireceği bir rakam(dahil) kadar olan sayıların toplamını bulunuz

        Scanner oku=new Scanner(System.in); // read, r, scan, scanner, _scanner
        System.out.print("kaça kadar toplanacak = ");

        int sinir= oku.nextInt();
        int toplam=0;

        for (int i=1; i<=sinir ; i++)
        {

            toplam=toplam+i;
        }
        System.out.println("toplam = " + toplam);
    }

}
