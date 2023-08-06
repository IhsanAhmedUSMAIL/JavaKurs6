package Gun09;

import java.util.Scanner;

public class _06_JavaIf {

    public static void main(String[] args) {

        // Girilen bir cümlede a harfinin geçip geçmediğini bulunuz
        // geçiyor ise EVET, geçmiyor ise HAYIR yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");

        String cumle= oku.nextLine();

        boolean varMi=cumle.contains("a");

        if (varMi == true)
            System.out.println("EVET");

        if (varMi == false)
            System.out.println("HAYIR");

        //2. YÖNTEM

        if (cumle.contains("a") == true)
            System.out.println("EVET");

        if (cumle.contains("a") == false)
            System.out.println("HAYIR");
        // 3. yöntem

        if (cumle.contains("a"))
            System.out.println("EVET = " + cumle);

        if (!cumle.contains("a")) // ! içerisinde a geçiyor değil ise demek
            System.out.println("HAYIR = " + cumle);

        // Alternatif
        cumle.contains("a"); // a içeriyor mu
        cumle.indexOf("a"); // a içeriyor ise indexini verir (0-....)
                            // a içermiyor ise -1 verir

        if (cumle.indexOf("a") >=0) // != -1 de yazabilirdik
            System.out.println("EVET");

        if (cumle.indexOf("a") == -1) // < 0 de yazabilirdik
            System.out.println("HAYIR");



    }


}
