package Gun07;

public class _08_StringStartWith {

    public static void main(String[] args) {

        // StartWith : bununla başlıyor mu?
        // sonuç true veya false

        String text="HCL Teknoloji"; // LeasePlan

        System.out.println("text.startWith(HC) = " + text.startsWith("HC")); // true
        System.out.println("text.startWith(te) = " + text.startsWith("te")); // false
        System.out.println("text.start.With(h) = " + text.startsWith("h")); // false
        System.out.println("text.startWith (H) = " + text.startsWith("H")); // true

    }

}
