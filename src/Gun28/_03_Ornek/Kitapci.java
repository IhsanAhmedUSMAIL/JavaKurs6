package Gun28._03_Ornek;

public class Kitapci {

    public static void main(String[] args) {

            Kitap bk1 = new Kitap();
            bk1.name = "Harry Potter";
            bk1.publishYear = 1997;
            bk1.author = "JK Rowling";

            Kitap bk2 = new Kitap("yüzükler", 1995, "JRR Tolkein");
            Kitap bk3 = new Kitap("Üzüm ve çay", 2023);

            System.out.println("bk1 = " + bk1);
            System.out.println("bk2 = " + bk2);
            System.out.println("bk2 = " + bk2);

        }

    }
