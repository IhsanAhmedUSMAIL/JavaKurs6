package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {


        int[][] tablo=new int[2][3];
        int[][] tablo2={

                {4,55}, // 0. satır, 2 sütun
                {3,56,77}, // 1. satır, 3 sütun
                {23,2,3,1,4,55,66,7}, // 2. satır, 2 sütun
                {13,44,55}, // 3. satır, 3 sütun
                {43} // 4. satır, 1 sütun
        };
        for (int satir = 0; satir < tablo2.length; satir++) {
            for (int sutun = 0; sutun < tablo2[satir].length; sutun++)
                System.out.print(tablo2[satir][sutun]+ " ");
            System.out.println();


        }
    }
}
