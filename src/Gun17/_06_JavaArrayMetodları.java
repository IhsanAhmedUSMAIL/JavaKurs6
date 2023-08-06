package Gun17;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_JavaArrayMetodları {

    public static void main(String[] args) {

        String[] isimler={"Ahmet","Zeynep","Adil","Eman","Ahmed"};

        // diziyi direk ekrana yazdırmak için
        System.out.println("isimler = " + Arrays.toString(isimler)); // Arrays bu dizilerin ve metaoların olduğu yer

        int[] a={1,8,3,54};
        System.out.println("a = " + Arrays.toString(a));

        // dizi sıralama (harflere harflere göre sayıları sayılara göre sıralıyor)
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        // Diziler eşit mi
        int[] b={1,8,3,54};
        int[] c={1,3,8,54};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,b)); // false

        // contains gibi çalışır, var ise pozitif sayı verir
        // Sadece sıralı dizilerde çalışır

        System.out.println("Arrays.binarySearch(a,3) = " + Arrays.binarySearch(a,3)); // - değer yok
        System.out.println("Arrays.binarySearch(c,3) = " + Arrays.binarySearch(c,3)); // 1, var demek

        // Bir değer ile diziyi hızlıca doldurmak için
        Arrays.fill(a,5);
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));


    }

}
