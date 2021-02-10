public class Gul extends Cicek{

    private String kokusu;



    public String getKokusu() {
        return this.kokusu;
    }

    public void setKokusu(String kokusu) {
        this.kokusu = kokusu;
    }




    public Gul(String rengi, Yaprak yaprak1, Sap sap1, String kokusu) {
        super(rengi, yaprak1, sap1);
        this.kokusu = kokusu;
    }

}