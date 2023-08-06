package Gun07;

public class _01_StringConcat {

    public static void main(String[] args) {

        // concat : bir string değerini birleştiriyor

        String s1= "Merhaba";
        String s2= "Dünya";

        System.out.println("birleşik hali= " + s1 + s2);
        System.out.println("birleşik hali= " + s1.concat(s2)); // birleşmiş hali yukardaki ile verdiği sonuç aynı fakat yaptığı işlem farklı
        System.out.println("birleşik hali= " + s1.concat(" ").concat(s2));
        System.out.println("birleşik hali= " + s1.concat(" "+s2));

        System.out.println("s1 =" + s1); // s1 in değeri değişmedi
        System.out.println("s2 =" + s2); // s2 in değeri değişmedi


    }

}
