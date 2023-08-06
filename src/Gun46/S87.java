package Gun46;

public class S87 {

    public static void main(String[] args) {

        int n[][] = {{1, 3},{2, 4}};

        for (int i = n.length-1; i>=0; i--) { // i: 1,0

            for (int j = n[i].length; j>=0; j--) { // j; 1,0
                System.out.println(n[i][j]); // 11, 10, 01, 00

            }

        }

    }
}
