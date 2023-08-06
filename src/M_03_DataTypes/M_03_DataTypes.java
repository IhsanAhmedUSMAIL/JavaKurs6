package M_03_DataTypes;

public class M_03_DataTypes {

    public static void main(String[] args) {

        // ilkel veri tipleri

        byte myByte=127;
        short myShort =327;
        int myInt= 1058;
        long myLong=12084;
        float myFloat=42.8f; // büyük "F" veya küçük "f" fark etmez
        double myDouble= 8.58;
        char myChar= 'A';
        boolean myBoolean=true;

        String myText= "Merhaba Dostlar!", myWeb="https://conference.techno.study/html5client/join?sessionToken=foeb87htxxzdk5wo";

        System.out.println(myText+"\n"+myByte+"\n"+myShort+"\n"+myInt+"\n"+myLong+"\n"+myFloat+"\n"+myDouble+"\n"+myChar+"\n"+myBoolean);

        System.out.println("myText = " + myText);
        System.out.println(myWeb);

    }

}
