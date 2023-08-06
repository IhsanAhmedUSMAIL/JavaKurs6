package Gun12;

import java.util.Scanner;

public class _06_Switch {

    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Gün no = ");
        int gunNo= oku.nextInt();

        switch (gunNo) {
            case 1: System.out.println("PAZARTESİ"); break; // Switch çık
            case 2: System.out.println("SALI"); break;
            case 3: System.out.println("ÇARŞAMBA"); break;
            case 4: System.out.println("PERŞEMBE"); break;
            case 5: System.out.println("CUMA"); break;
            case 6: System.out.println("CUMARTESİ"); break;
            case 7: System.out.println("PAZAR"); break;

            default: System.out.println("Hatalı giriş");
        }

    }

}
