import java.util.Scanner;

public class ders5 {
    public static void main(String[] args){

        /*

        System.out.println("Liza" == "Liza");

        System.out.println((3== 3 && "Liza" == "Liza") || !("Liza" == "Liza"));

         */

        Scanner scanner1 = new Scanner(System.in);

        int not = scanner1.nextInt();

        if (not >95) {
            System.out.println("Sınava çok güzel hazırlanmışsın!");
        }

        else if (not <= 95 && not > 85)
            {
                System.out.println("Fena değil!");
            }

        else if (not <= 85 && not > 50)
            {
                System.out.println("Daha çok çalışmalısın dostum.");
            }

        else if (not <= 50 && not > 0)
            {
                System.out.println("Notların pek iyi değil...");
            }

        else
            {
                System.out.println("Geçersiz bir not girdiniz.");
            }

    }
}
