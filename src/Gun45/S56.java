package Gun45;

public class S56 {
    public static void main(String[] args) {

        String names[] = {"Thomas", "Peter","Joseph"};
        String pwd[] = new String[3];
        int idx=0;

        try {
            for (String n : names) {
                pwd[idx] = n.substring(2,6); // 2 den 5 e kadar dahil edilmiş oluyor
                System.out.println(pwd[idx]); // omas yazıldı
                idx++;
            }

        }catch (Exception e)
        {
            System.out.println("Invalid Name"); // Invalid Name
        }

    }
}
