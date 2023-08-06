package Gun26_02_Ornek;

public class Person {

    String name;
    String surname;
    int age;
    // Bunlara field, properties, özellik denir.
    // Alttakiler ise fonksiyonlarıdır.

    public void bilgiYazdir()
    {
        System.out.println("Adı = " + this.name);
        System.out.println("Soyadı = " + this.surname);
        System.out.println("Yaşı = " + this.age);

    }

    // Yazdırılırken otomatik çağırılıyor
    public String toString() {
        return this.name+"\t"+this.surname+"\t"+this.age;
    }

    public void getBirthYear()
    {
        System.out.println("Doğum yılı ="+
                (2023-this.age));
        // yukarda public int getBirthYear() yapıp return 2023-this.age

    }


}
