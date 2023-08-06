package Gun42;

import Gun27._02_Ornek.SoruMain;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        // String kendi değerini değiştirmesi için atamak gerekir

        String cumle="";
        cumle=cumle+"Bugün"; //Bugün
        cumle=cumle+" hava"; // atamak gerektirir
        cumle+= " çok soğuk";

        System.out.println("cumle = " + cumle);
        System.out.println(cumle+" değil mi");
        //Bugün hava çok soğuk
        System.out.println("cumle.concat() = " + cumle.concat(" dün değildi"));
        System.out.println("cumle = " + cumle);
        cumle.concat(" merhaba"); // cumlenin değeri değişmez, atama gerektirir
        cumle=cumle.concat(" merhaba"); // cümlenin değeri değişir

        /***************** StringBuilder ************/
        StringBuilder cumle2=new StringBuilder();
        cumle2.append("Bugün"); // direk kendisine atıyor. eşitleme gerekmiyor
        cumle2.append(" hava");
        cumle2.append(" soğuk");
        System.out.println("cumle2 = " + cumle2);

        /****************** +,concat, StringBuilder 3 model hız testi *************/

        long startTime=System.currentTimeMillis();
        String test1="";
        for (int i = 0; i < 10000; i++) {
            test1=test1+" merhaba";

        }

        System.out.println("+ için geçen süre="+ (System.currentTimeMillis()-startTime) + "ms");

        startTime=System.currentTimeMillis();
        String test2="";
        for (int i = 0; i < 10000; i++) {
            test2=test2.concat(" merhaba");

        }

        System.out.println("concat için geçen süre=" + (System.currentTimeMillis()-startTime) + "ms");

        startTime=System.currentTimeMillis();
        StringBuilder test3=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append(" merhaba");
        }

        System.out.println("StringBuilder için geçen süre="+ (System.currentTimeMillis()-startTime) + "ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("\n\n****************************************");
        /*                StringBuilder ı yakından tanıyalım             */

        StringBuilder sb=new StringBuilder();
        sb.append("Bugün "); // kendine ekleme, atama gerektirmiyor
        sb.append("hava ");
        sb.append("biraz soğuk");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);
        System.out.println("sb = " + sb);

        sb.reverse(); // Stringi ters çevirir
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); // index: 0 dahil, 5 hariç siliyor
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); //sadece belirtilen indexteki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime "); // 5 nolu indexe kelime yi ekle, araya ekleme
        System.out.println("sb = " + sb);

        String parca=sb.substring(5,8); // 5 dahil 8 değil
        System.out.println("parca = " + parca);

        // string fonksiyonları kullanmak için toString demek yeterli
        sb.toString().endsWith("de");

        sb.replace(5,8,"Saç"); // verilen aralığa verilen kelime eklenir

        sb=new StringBuilder(); // tamamen sıfırlamak yenilemek
        sb=new StringBuilder("Bugün hava soğuk"); // tanımlarken ilk atama yapılabilir (String i StringBuilder e çevirebilirsin)


        StringBuffer sBuffer= new StringBuffer(); // tamamen StringBuilder ile aynı
        // tek farkı paralel çalışan yazılımlar için kullanılır.

    }


}
