package Gun46;

public class S82 {

    public static void main(String[] args) {

        String[][] chs = new String[2][]; // Satır sayısı belli. Sutun sayısı belli değil atanırken belli olacak
        chs[0] = new String[2]; // 0. satır 2  elemanlı 0,1
        chs[1] = new String[5]; // 1. Satır 5 elemanlı 0,1,2,3,4

        int i = 97;

        for (int a = 0; a < chs.length; a++ ) { // 2'ye kadar gider 0,1

            for (int b = 0; b < chs.length; b++) { // 2 ye kadar gider 0,1
                chs[a][b] =" "+i;
                i++;

            }

        }
        for (String[] ca : chs) {
            for (String c:ca){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

}
// Çıktı
// 97,98,99,100,null,null
