package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int sonuc1 = toplamBul(s1, s2);
        int sonuc2 = toplamBul(s1, s2, s3);
        int sonuc3 = toplamBul(s1, s2, s4);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }

    public static int toplamBul(int... dizi) // ... gelenin hepsini al kullan
    {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++)
            toplam = toplam + dizi[i];

        return toplam;
    }

    }
   // public static int toplamBul (int s1, int s2)
    // {
    //     return (s1+s2);
    // }

    //  public static int toplamBul (int s1, int s2, int s3)
    //  {
    //      return (s1+s2+s3);
    //  }

    //  public static int toplamBul (int s1, int s2, int s3, int s4)
    //  {
    //    return (s1+s2+s3+s4);
    //  }

