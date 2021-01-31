import java.util.Scanner;

public class ders3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int sayi1;
        int sayi2;

        System.out.print("ilk sayıyı giriniz: ");
        sayi1 = scanner.nextInt() ;

        System.out.print("ikinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();

        System.out.println("ilk sayı: " + sayi1);
        System.out.println("ikinci sayı: " + sayi2);

    }
}
