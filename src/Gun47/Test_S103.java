package Gun47;

class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }
}

public class Test_S103 {

    public static void main(String[] args) {
        Student [] students= new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students) {
            System.out.println("" + s.name); // başta null.name ismini yazdırmaya çalıştığı için hata verir (NullPointException)
        }

        // alttaki kodlar yukardaki satırlar ile aynı şeyi ifade eder
        Student ogr0;
        Student ogr1=new Student("İsmet");
        Student ogr2=new Student("Ayşe");
    }

}