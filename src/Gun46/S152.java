package Gun46;

public class S152 {

    public static void main(String[] args) {

        int n[][] = {
                {1, 3}, // 0. satır n[0]
                {2, 4}  // 1. satır n[1]

        };

        for (int i = n.length - 1 ; i>=0; i--) { // 1,0

            for (int y : n[i]){
                System.out.println(y); //2,4 , 1,3
            }
        }

    }

}
