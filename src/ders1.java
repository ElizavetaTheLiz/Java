
public class ders1 {

    public static void main(String[] args){

        byte a=10;
        short b=5;
        int c= a + b;

        float f =  22/7;
        double d = 22/7;

        byte e = 100;
        byte i = (byte) (e/2);

        char h = '\u03C3' ;

        System.out.println(Integer.MAX_VALUE);
        System.out.println("Değişken değiştirme işlemi sonucu = " + c);
        System.out.println("Değişken türünü kendimiz fonksiyon kullanarak değiştirdik = " + i);
        System.out.println("Float 22/7 işlemi sonucu = " + f);
        System.out.println("Double 22/7 işlemi sonucu = " + d);
        System.out.println("omega char = " + h);
    }
}
