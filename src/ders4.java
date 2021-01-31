import java.util.Scanner;

public class ders4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("ilk kenar uzunluğu: ");
        int a= scanner.nextInt();
        System.out.print("ikinci kenar uzunluğu: ");
        int b= scanner.nextInt();

        double h = Math.sqrt( a*a + b*b) ;

        System.out.println("hipotenüs uzunluğu: " + h);

        int[] sayilar1 = {0, 2, 4, 11, 12};
        int[] sayilar2 = {};

    }

}
