package Gun37._02_Soru;

import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {
        Swallow s=new Swallow();
        Cat c=new Cat();
        Shark sh= new Shark();
        Duck d=new Duck();

        ArrayList<IAnimal> animals=new ArrayList();
        animals.add(s);
        animals.add(c);
        animals.add(sh);
        animals.add(d);

        for (IAnimal a : animals)
        {
            System.out.println("---------");
            System.out.println(a.getClass().getSimpleName());
            System.out.println(a.food());
        }

    }
}
