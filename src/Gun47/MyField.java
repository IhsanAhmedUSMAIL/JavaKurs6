package Gun47;

public class MyField { // normal bir class

    int x; // this.x
    int y; // this.y

    public void doStuff(int x, int y)
    {

        x=x; // class a bir etkisi yok, yani this.x değişmedi=100 olarak kaldı
        y=this.y; // this dediğin zaman classın demiş olursun.this omasaydı metod daki (8.satır) dakini temsil eder.
                  // class ta bir değişiklik yok this.y y=0 (this sağda olunca metodakini mi değiştirmiş oluyorsun)
    }

    public void doStuff2(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        MyField m1=new MyField(); // yeni bir nesne oluştu mu ?
        System.out.println("m1.x = " + m1.x);
        System.out.println("m1.y = " + m1.y);

        m1.x=100;
        m1.y=200;
        System.out.println("m1.x = " + m1.x);
        System.out.println("m1.y = " + m1.y);

        MyField m2=new MyField(); // m2 nin x ve y si 0 dır
        m2.doStuff(m1.x, m1.y); // bunların değerleri gidiyor
        // bu işlem herhangi bir değer değiştirmez

        m1.display(); // 100:200
        m2.display();; // 0:0

    }

}
