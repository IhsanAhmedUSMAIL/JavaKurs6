package Gun30._01_staticVariables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1=new Student(1,"Ihsan USMAIL");
        Student ogr2=new Student(2,"Eman OMER");
        Student ogr3=new Student(3,"Adil USMAIL");

        // problem : hem id yi takip etmek zorundayım
        // hem de hata olasılığı yüksek

        Student ogr10=new Student("Ihsan");
        Student ogr11=new Student("Adil");
        Student ogr12=new Student("EMAN");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);

        // ogr10.id=5005; kendin atamaman lazım. o yüzden pricate yaptık.
        // Student.sayac=5005; kendin atamaman lazım.

    }
}
