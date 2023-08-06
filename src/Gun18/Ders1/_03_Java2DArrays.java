package Gun18.Ders1;

import java.util.Arrays;

public class _03_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo={ // 2 satır, 3 sütün new[2][3]
                {2,3,44}, // 1.satir 3 elemanlı
                {45,66,5}, //2. satır 3 elemanlı
        };

        System.out.println(Arrays.toString(tablo[0] ) ); // 0. satır tümü
        System.out.println(Arrays.toString(tablo[1] ) ); // 1. satır tümü
        System.out.println("tablo[0].length = " + tablo[0].length); // 0. satırın uzunluğu (sutun sayısını burdan alabilitsin)
        System.out.println("tablo[1].length = " + tablo[1].length);// 1. satırın uzunluğu (sutun sayısını burdan alabilitsin)

        System.out.println("tablo = " + tablo.length); // kaç satır var, satır uzunluğu

        for (int satir=0; satir<tablo.length; satir++) { // 0,1

            for (int sutun=0; sutun < tablo[satir].length; sutun++) // her bir satırın sütünlarını yazdıran for
                System.out.println(tablo[satir][sutun]+ " ");

            System.out.println();
        }
    }
}
