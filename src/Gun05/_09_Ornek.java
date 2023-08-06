package Gun05;

import java.util.Scanner;

public class _09_Ornek {

    public static void main(String[] args) {

        // kullanıcıdan ağırlığını (kg) double, boyunu(m) double olarak alınız
        // ve bir satırdan boyunuz .... ve kilonuz .... şeklinde yazdırınız.
        // vucut kitle indexxini de bularak yazdırınız kg/ (boy*boy)

        Scanner oku=new Scanner(System.in);

        System.out.print("Ağırlığınızı giriniz (Kg) = " );
        double agirlikoku= oku.nextDouble();

        System.out.print("Boyunuzu giriniz (m) = " );
        double boyoku=oku.nextDouble();

        double vki=agirlikoku/(boyoku*boyoku);

        System.out.println("Kilonuz = " +agirlikoku+" Kg, boyunuz="+boyoku+"m");
        System.out.println("vucutkitle Indeksiniz = " + vki);

    }

}
