import java.util.Scanner;

public class ders6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz:");
        double boy= (double) scanner.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        double kilo= (double) scanner.nextDouble();
        double sonuc = kilo/ (boy * boy);

        System.out.println("Kitle endeksiniz = " + sonuc);

    }

}
