package Tekrar;

import java.util.ArrayList;

public class _08_ArrayList {
    public static void main(String[] args) {

        // boyutu değişken, ekledikçe uzayabilsin, sildikçe kısalsın

        ArrayList<Integer> list=new ArrayList<>();

        list.add(9);
        list.add(10);
        list.add(11);

        System.out.println("list = " + list);

        for (int i = 0; i< list.size(); i++) {
            System.out.println("list.get(i) = " + list.get(i)); // dizi [i]

        }

    }

}
