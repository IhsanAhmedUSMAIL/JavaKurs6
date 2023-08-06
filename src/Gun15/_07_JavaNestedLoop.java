package Gun15;

public class _07_JavaNestedLoop {

    public static void main(String[] args) {

        // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız. (bir for satırı takip edecek, diğer for * takip edecek)
        // *****
        // *****
        // *****
        // *****
        // *****



        for (int satir = 1; satir <=5 ; satir++) {

            for (int i = 1; i <=5 ; i++)
                System.out.print("*");
            System.out.println(); // bu satır olmasaydı 25 adet * işaretini yan yana yazardı.
        }


    }


}
