public class deneyap2 {

    public static void main(String[] args) {

        double sinav1 = 78.8;
        double sinav2 = 96.56;
        double sinav3 = 85.54;

        double sonuc = (sinav1 * 0.25) + (sinav2 * 0.25) + (sinav3 * 0.50);

        if (sonuc >= 90 && sonuc <= 100) {
            System.out.println("AA aldınız");
        }

        else if (sonuc < 90 && sonuc >= 80) {
            System.out.println("BA aldınız");
        }

        else {
            System.out.println("Diğer");
        }

    }
}