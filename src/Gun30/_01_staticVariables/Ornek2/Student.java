package Gun30._01_staticVariables.Ornek2;

public class Student {

    private int id;//Nesneye ait
    private String fullname;//Nesneye ait
    private static int sayac=1; // class a ait. Sen BİTANESİN.
    // static olmadan herzaman 1 le başlıyordu
    // static olduğunda artık bir tane olduğundan
    // değerini korudu ve hep 1 tane arttı
    // tüm nesnelere ait olan bilgileri veya
    // sayac gibi işlemler için static kullanılır.

    public Student(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public Student(String fullname) {
        this.fullname = fullname;
        this.id=sayac++; //++ sonradan yazıldığı için önce işlem yapar sonra artış.
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
