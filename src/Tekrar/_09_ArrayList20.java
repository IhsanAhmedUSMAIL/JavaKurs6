package Tekrar;

import java.util.ArrayList;

public class _09_ArrayList20 {

    public static void main(String[] args) {


        ArrayList<Integer> matNotlar=new ArrayList<>(); // bunun her bir satırı sayı int[]
        ArrayList<Integer> kimyaNotlar=new ArrayList<>(); // bunun her bir satırı sayı int[]

        ArrayList<ArrayList<Integer> > tumNotlar=new ArrayList<>(); // her bir satırı liste int[][]

        matNotlar.add(5);
        matNotlar.add(6);
        matNotlar.add(7);
        matNotlar.add(8);

        tumNotlar.add(matNotlar);

        matNotlar.add(10);

        kimyaNotlar.add(53);
        kimyaNotlar.add(63);
        kimyaNotlar.add(73);
        kimyaNotlar.add(83);

        tumNotlar.add(kimyaNotlar);

        tumNotlar.get(0); // matNotlar
        tumNotlar.get(1); // kimNotlar

        matNotlar.get(0); // mat ın ilk notunu verir
        tumNotlar.get(0).get(0); // matın ilk notunu verir

        System.out.println("tumNotlar = " + tumNotlar.get(0));
        System.out.println("tumNotlar.get(0).get(0) = " + tumNotlar.get(0).get(0));

        System.out.println("tumNotlar.get(1).get(0) = " + tumNotlar.get(1).get(0));





    }

}
