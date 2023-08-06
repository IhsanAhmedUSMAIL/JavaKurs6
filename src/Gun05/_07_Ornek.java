package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {

        // bir dikdörtgenin gerekli kenar(int) uzunluklarını kullanıcıdan
        // isteyip çevresini ve alanını bulunuz ve yazdırınız
        // cevre=a+b+a+b  alan=a*b

        Scanner oku = new Scanner(System.in);

        System.out.print("Uzun kenar = ");
        int Uzunkenar= oku.nextInt();

        System.out.print("Kısa kenar = ");
        int Kisakenar= oku.nextInt();

        int alan=Uzunkenar*Kisakenar;
        System.out.println("alan = " + alan); // önerilen yöntem çünkü anlaşılır

        int cevre=Uzunkenar+Kisakenar+Uzunkenar+Kisakenar;
        System.out.println("cevre = " + cevre); // önerilen yöntem çünkü anlaşılır

        // veya

        int cevre1=Uzunkenar+Kisakenar+Uzunkenar+Kisakenar;
        int alan1=Uzunkenar*Kisakenar;


        //veya

        System.out.println("cevre = " + (Uzunkenar+Kisakenar+Uzunkenar+Kisakenar));
        System.out.println("alan = " + (Uzunkenar*Kisakenar));




    }
}
