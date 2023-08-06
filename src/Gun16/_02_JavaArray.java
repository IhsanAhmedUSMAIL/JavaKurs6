package Gun16;

import java.util.Scanner;

public class _02_JavaArray {

    public static void main(String[] args) {

        // dizi nasıl okunur ve nasıl yazdırılır

        Scanner oku=new Scanner(System.in);
        int [] dizi=new int[10]; // 10 elemanlı bir dizi tanımladı. index leri 0-9. 0-10 dersen challanger patlar

        for (int i = 0; i < 10; i++) {  // 10 yerine dizi.length yazabilirsin (length eleman sayısını gösterir)
            System.out.print((i+1)+"."+"Sayi giriniz=");
            dizi[i]= oku.nextInt(); // i sürekli 0,1,2,3,4,5,6,7,8,9 olarak devam ediyor

        }

        for (int i = 0; i < 10; i++) {

            System.out.println("dizi["+i+"] = " + dizi[i]);

        }

    }

}
