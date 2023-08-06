package Gun26_02_Ornek;

public class Sirket {

    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de iki tane bu sınıftan nesne oluşturup değer atayınız.
    // 3- Adım : Bu değerleri yazdırınız.
    // 4- Adım : getBirthYear isminde person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.

    public static void main(String[] args) {

        Person cls1=new Person();
        cls1.name="Ihsan";
        cls1.surname="USMAIL";
        cls1.age=20;

        Person cls2=new Person();
         cls2.name="Eman";
         cls2.surname="OMER";
         cls2.age=19;

         //1. Yöntem
        System.out.println("cls1.name = " + cls1.name);
        System.out.println("cls1.surname = " + cls1.surname);
        System.out.println("cls1.age = " + cls1.age);

        System.out.println("cls2.name = " + cls2.name);
        System.out.println("cls2.surname = " + cls2.surname);
        System.out.println("cls2.age = " + cls2.age);

        //2.Yöntem
        BilgiYazdir(cls1);
        BilgiYazdir(cls2);

        //3. Yöntem
        cls1.bilgiYazdir();
        cls2.bilgiYazdir();

        //4. Yöntem
        System.out.println("cls1 = " + cls1);
        System.out.println("cls2 = " + cls2);

        cls1.getBirthYear();
        cls2.getBirthYear();

    }

    public static void BilgiYazdir(Person cls) // cls1, cls2 hangisini gönderirsen onu yazar.
    {
        System.out.println("cls.name = " + cls.name);
        System.out.println("cls.surname = " + cls.surname);
        System.out.println("cls.age = " + cls.age);
    }
    
}
