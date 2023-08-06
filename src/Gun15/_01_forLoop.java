package Gun15;

public class _01_forLoop {

    public static void main(String[] args) {

        // 0 dan 100 e kadar olan çift sayıların toplamını bulunuz.
        // toplam 50 yi geçtiğinde "50 geçildi" şeklinde ekrana mesaj yazdırınız. ve döngüden çıksın

        int toplam=0;
        boolean sinirAsildi=false;

        for (int i = 0; i <=100 ; i=i+2) {
            toplam=toplam+i;
            System.out.println("i = " + i);

            if (toplam > 50 && sinirAsildi==false) {
                System.out.println("toplam 50 yi geçti"); // sadece bir kere yazması için
                sinirAsildi = true;
                break; // döngüden sonraki adıma geç
            }

        }
        System.out.println("toplam = " + toplam);

    }

}
