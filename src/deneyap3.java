public class deneyap3 {

    public static void main(String[] args) {

        boolean krampon = true;
        boolean raket = true;
        boolean havlu = true;
        boolean yay = true;
        int oynamaLimit = 2;


            if (krampon && havlu && (oynamaLimit > 0)) {
                System.out.println("Futbol");
                oynamaLimit -= 1;
            }

            if (havlu && raket && (oynamaLimit > 0)) {
                System.out.println("Tenis");
                oynamaLimit -= 1;
            }

            if (yay && (oynamaLimit > 0)) {
                System.out.println("Okçuluk");
                oynamaLimit -= 1;
            }

        }
    }
