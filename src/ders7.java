import java.util.Scanner;

public class ders7 {
    public static void main(String[] args){

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("0-5 arası bir sayı giriniz: ");
        int islem = scanner1.nextInt();

        switch (islem){
            case 1:
                System.out.println("sayınız 1");
                break;

            case 2:
                System.out.println("sayınız 2");
                break;

            case 3:
                System.out.println("sayınız 3");
                break;

            case 4:
                System.out.println("sayınız 4");
                break;

            case 5:
                System.out.println("sayınız 5");
                break;

            default:
                System.out.println("geçersiz sayı");
                break;
        }

    }
}
