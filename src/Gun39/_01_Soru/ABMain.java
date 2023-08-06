package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a=new A(); // static olduğu için nesnedeen bağımsız dolayısıyla etkisiz
        System.out.println("A.mesaj = " + A.mesaj); // A

        B b=new B(); // constructor çalıştığı için statiğin değeri değişti yoksa bunun da etkisi yok
        System.out.println("A.mesaj = " + A.mesaj); // B

        A a2=new A(); // static olduğu için nesnedeen bağımsız dolayısıyla etkisiz
        System.out.println("A.mesaj = " + A.mesaj); // B
        // en son değeri çalıştırdığı için çıktısı 'B'


    }
}
