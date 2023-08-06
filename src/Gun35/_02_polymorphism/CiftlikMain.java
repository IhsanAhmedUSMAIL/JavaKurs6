package Gun35._02_polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1=new Kopek("Karabaşı");
        //  kopek1.ses(); // havladı yazacak
        //  kopek1.kokladi(); // kokladı yazacak

        Kedi kedi1=new Kedi("Tekir");
        // kedi1.ses();// miyavladı yazacak
        // kedi1.tirmaladi(); // tırmaladı yazacak

        // kopekSesi(kopek1);// havladı yazacak
        // kediSesi(kedi1); // miyavladı yazacak

        // kopekSesi(kedi1);birbirlerine kabul etmezler

        hayvanSesi(kopek1);
        hayvanSesi(kedi1);

        //Setlerden HashSet
        //Maplerden HashMap
        //Listelerden ArrayList

        // Hayvanlardan kedi
        // Hayvanlardan kopek
        // Hayvanlardan hayvan

        Hayvan hayvan1=new Hayvan("Ördek"); // hayvanlardan 1 hayvan
        Hayvan hayvan2=new Kopek("Kangal"); // hayvanlardan 1 kopek
        Hayvan hayvan3=new Kedi("Boncuk"); // hayvanlardan 1 kedi

        System.out.println("--------------------"); // kendine özel olanları ÇIKARTAMIYOR.
        hayvan1.ses(); // ses çıkardı yazacak
        hayvan2.ses(); // havladı yazacak
        hayvan3.ses(); // miyavladı yazacak
        System.out.println("--------------------"); // kendine özel olanları ÇIKARTIYOR. mesela tırmaaldı

        ((Kopek)hayvan2).kokladi();

        // polymorphism -
        //           çok formluluk - Çok çeşitlilik
        // şizofren bir knou
        //
        // Bir NESNENİN istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
        // ve bu şekilde kullanılabilmesine Polymorphism denir.

        // Öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.



    }

    public static void hayvanSesi(Hayvan hayvan) {
        hayvan.ses();//

        // instanceof : türetildiği yer
        // bir class ın aslında kim olduğunu bulma yöntemi
        if (hayvan instanceof Kopek ) // hayvan aslında köpek ise
            // (hayvan köpeğin nesnesi mi)
            ((Kopek)hayvan).kokladi();

        if (hayvan instanceof Kedi) // hayvan aslında kedi ise
            // (hayvan kedinin nesnesi mi)
            ((Kedi)hayvan).tirmaladi();

    }

    public static void kopekSesi(Kopek kopek) {
        kopek.ses(); // havladı yazacak
    }

    public static void kediSesi(Kedi kedi) {
        kedi.ses(); // miyavladı yazacak
    }

    // Hayvan classından türettiğimiz-extend yaptığımız için
    // hayvanSesi olarak eklediğimiz methoddan yazdırdığımızda da
    // köpek ve kedi için classlarından Override yaparak yazdığımız
    // özellikleri alarak yazdı
    // Ama tırmaladı, kokladı gibi kedi köpek classına özel olarak
    // yazdıklarımızı hayvanSesi metodundan yazdıramayız

}
