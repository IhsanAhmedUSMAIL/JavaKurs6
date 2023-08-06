package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    // sayın java, bana öyle bir dizi tip ver ki ben ekledikçe boyu uzasın.sildikçe kısalsın

    // java derki : güzel olur tamam vereceğim. Fakat bunu bil ki,
    // kaç eleman olduğu belli ise şuana kadar gösterdiğim dizi tipini kullan
    // çünkü bu hızlı çalışıyor,
    //senin istediğin dinamik dizi olduğundan bundan
    // yavaş çalışacaktır

    //  liste : eklersin silersin, boyu ona göre değişir.

    public static void main(String[] args) {

        int[] dizi=new int[5]; // 5 elemanlı Array, boyutu değiştirilemez

        // Boyu dinamik olsun, eleman ekledikçe uzasın, sildikçe kısalsın
        // ArrayList : boyutunu baştan vermen gerekmiyor. boyutu başlangıçta 0
        // eleman ekledikçe artar, sildikçe kısalır.

        ArrayList<Integer> integerList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();
        ArrayList<Double> doubleList= new ArrayList<>();

        ArrayList<String> isimler=new ArrayList<>();
        System.out.println("isimler = " + isimler);

        isimler.add("Ahmed"); // UZUNLUK 1
        isimler.add("Adil"); // 2
        isimler.add("Eman"); // 3
        isimler.add("USMAIL"); // 4 // Sona ekler

        System.out.println("isimler = " + isimler); // yazdırır
        System.out.println("isimler = " + isimler.size()); // .length den farklı olarak
        // () parantez olması işlem yapıp sonuç verdiğini gösterir. Çunku Array list dizilerden farklı olarak dinamik list

        isimler.add(1,"Aysha"); // verilen index e ekliyor, diğerler 1 kayıyor sona doğru
        System.out.println("isimler = " + isimler);
        System.out.println("isimler = " + isimler.size());

        isimler.set(1,"Elife"); // verilen indexteki elemanı değiştirir.
        System.out.println("isimler = " + isimler);


        boolean varMi = isimler.contains("Elife"); // elife var mı
        System.out.println("Elife varMi = " + varMi);

        isimler.remove("Ahmed"); // değere göre sil
        System.out.println("varMi = " + varMi);

        isimler.remove(2); // Eman index e göre sil
        System.out.println("isimler = " + isimler);

        int indexOfAdil = isimler.indexOf("Adil");
        System.out.println("indexOfAdil = " + indexOfAdil);

        String ilkEleman = isimler.get(0); //0. elemanı ver
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear();
        System.out.println("isimler = " + isimler);


    }

}
