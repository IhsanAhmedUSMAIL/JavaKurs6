package Gun46;

public class S71 {
    public static void main(String[] args) {

        int[][] arr = new int[2][4];
        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};

        // arr.length nedir? Satır sayısı
        // a[i].length nedir ? satırdaki eleman sayısı yani sutun sayısı verir

        for (int[] a : arr) {

            for (int i =0; i< arr.length; i++) { // arr.length satır sayısını verir. 1313 çıktı verir
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }
}

// Çıktı
// 1 3 1 3
// a[i].length olsaydı çıktı alttaki gibi olacaktı. çünkü her elemanın eleman sayısını verir
// 1 3 5 7 1 3
