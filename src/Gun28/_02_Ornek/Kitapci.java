package Gun28._02_Ornek;

public class Kitapci {

    public static void main(String[] args) {
        Book bk1=new Book();
        bk1.name="Harry Potter";
        bk1.publishYear=1997;
        bk1.author="JK Rowling";

        Book bk2=new Book("yüzükler", 1995, "JRR Tolkein");
        Book bk3=new Book("Üzüm ve çay", 2023);


        System.out.println("bk1 = " + bk1);
        System.out.println("bk2 = " + bk2);
        System.out.println("bk2 = " + bk2);

    }

}
