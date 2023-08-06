package Gun45;

public class S64 {
    public static void main(String[] args) {

        String[] arr={"A","B","C","D"};

        for (int i=0; i < arr.length; i++) {
            System.out.println(arr[i]+" "); // A

            if (arr[i].equals("C")){ // A yı C ye eşit mi diye sorduk. eşit olmadığı için çalışmadı
                continue; // çalıştığı zaman kendinden sonraki adımı pas geçecek (break) aksine
            }

            System.out.println("Work Done");
            break; // döngüyü kırar
        }

    }
}
// Çıktı A Work Done