package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S48 {

    public static void main(String[] args) {

        List colors = new ArrayList<>();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2); // 2. index olan red silindi

        colors.add(3,"chan"); // sıradaki indexe ekleyebiliyor
        // colors.add("chan); bununla aynı

       // colors.add(4,"chan"); arada boşluk bıraktığı için hata verir

        System.out.println("colors = " + colors);

    }

}
