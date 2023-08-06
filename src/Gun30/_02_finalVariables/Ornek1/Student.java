package Gun30._02_finalVariables.Ornek1;

public class Student {

    final int id;//Nesneye ait
    // Değiştirilemez
    // yani sadece 1 kez veri atama şansı var.
    String fullname;//Nesneye ait
    private static int sayac=1; // class a ait. Sen BİTANESİN.

    public Student(int id, String fullname) {
        this.id = id;
        // final değişkenlerinde sadece 1 kez veri atanabilir.
        //o da ya tanımlanırken ya da Constructor da
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
