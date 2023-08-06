package Gun08;

public class _06_JavaAssignmentOperators {

    public static void main(String[] args) {

        int a=10; // a ya 10 değer atadık

        a=5;  // a ya 5 değeri atanmış olur

        a=a+6; // a ya 6 değeri ekle 11 oldu
        a+=6; // a ya 6 değeri ekle 17 oldu yani a nın artış değeri 6 ya eşit

        a=a+1; // a yı 1 artır
        a++;   // a yı 1 artır
        ++a; // a yı 1 artır;
        a+=1; // a yı 1 artır yani a nın arış değeri 1 demek;

        /***********************/

        a=a-1; // a yı 1 azaltır
        a--;   // a yı 1 azaltır
        --a;   // a yı 1 azaltır
        a-=1; // a yı 1 azaltır yani a nın azalış değeri 1 demek;
        a-=25; // a yı 25 azalt yani a=a-25;

        /*****************/

        int b=10;
        b=b/5;   // 5 yi 5 e böl
        b/=5;    // 5 yi 5 e böl
        System.out.println("b = " + b);

        /******************/

        int c=10;
        c=c*5;   // c yi 5 ile çarp 50
        c*=5;    // c yi 5 ile çarp 50 : c nin çarpan değeri 5 e eşittir

        System.out.println("c = " + c);




    }

}
