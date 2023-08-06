package Gun13;

public class _04_WhileLoop {

    public static void main(String[] args) {

        // Ekrana 5 kez merhaba yazdırınız.

        int sayac=1;

        while (sayac<=5) // iken yap: şartı yazıyoruz, dönme şartını

        {
            // tekrarlanacak adımlar buraya yazılıyor
            System.out.println(sayac+" "+ "Merhaba");
            sayac=sayac+1; // sayac++, ++sayac yapabilirsin ,
        }

        System.out.println("Bitti");

    }

}
