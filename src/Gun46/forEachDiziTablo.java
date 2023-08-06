package Gun46;

public class forEachDiziTablo {
    public static void main(String[] args) {
        // tek boyutlu dizi
        int[] dizi = new int[]{1, 2, 3, 4, 5, 6};
        int[] dizi1 = {1, 2, 3, 4, 5};

        int dizi5[] = {1, 2, 3, 4, 5};

        int[] dizi2 = new int[3]; // 3 elemanlı  0,1,2
        dizi2[0] = 5;
        dizi2[1] = 5;
        dizi2[2] = 5;

        System.out.println("dizi2.length = " + dizi2.length); // 3

        for (int i = 0; i < dizi2.length; i++) { // i : 0,1,2
            System.out.print(dizi2[i] + " ");
        }

        System.out.println();

        for (int eleman : dizi2) // elamnlarını ver
            System.out.print(eleman + " ");

        System.out.println();

        //********** 2 boyutlu diziler yani tablo lar *****/

        int[][] tablo1 = new int[2][3]; // 2 satır 3 sütun
        //tablo1[0] -> 0.satır
        // tablo1[0].length -> 0.satırın o satır daki eleman sayısı
        tablo1[0][0] = 45;

        int[][] tablo2 = new int[][]
                {
                        {23, 4, 5, 6},
                        {34, 5}
                };

        int[][] tablo3 =
                {
                        {23, 4, 5, 6},
                        {34, 5}
                };

        int[][] tablo4 = new int[2][3]; // 2 satır 3 sütun
        tablo4[0] = new int[]{23, 4, 5, 6, 7, 8, 9}; // 0.satır 7 elemanlı
        tablo4[1] = new int[]{23, 4};           // 1.satır 2 elemanlı oldu


        for (int i = 0; i < tablo4.length; i++) { //2

            for (int j = 0; j < tablo4[i].length; j++) { // ilgili satırdaki eleman sayısı
                System.out.print(tablo4[i][j] + " ");
            }

            System.out.println();
        }
    }
}
