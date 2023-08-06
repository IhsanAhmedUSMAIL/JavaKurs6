package Gun46;

public class S39 {

    public static void main(String[] args) {

        String shirts[][] = new String[2][2];

        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";

        //a : medium
        for (int index = 1; index < 2; index++) { // 1 kere çalışır
            for (int idx = 1; idx<2; idx++) { // 1 kere çalışır
                System.out.println(shirts[index][idx] + ":");
            }
        }

        System.out.println();

        // b) small
        for (int index = 0; index < 2; ++index) {
            for (int idx = 0; idx < index; ++idx) {
                System.out.println(shirts[index][idx] + ":");
            }
        }
        System.out.println();

        // c  red: blue: small: medium
        for (String [] c : shirts) {
            for (String s : c){
                System.out.print(s + ":");
            }
        }

        System.out.println();

        // D : red:blue ArrayIndexOutOfBoundsException

        for (int index = 0; index <=2;) {
            for (int idx = 0; idx <=2;){
                System.out.print(shirts[index][idx] + ":");
                idx++;
            }
            index++;
        }

    }

}
