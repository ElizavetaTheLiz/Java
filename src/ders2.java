
import java.util.Scanner;

public class ders2 {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy

        String isim = scanner.nextLine();

        System.out.println("yaş= " + yas);
        System.out.println("isim = " + isim);

    }
}


