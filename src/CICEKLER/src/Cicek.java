public class Cicek{

    private String rengi;
    private Yaprak yaprak1;
    private Sap sap1;



    public String getRengi() {
        return this.rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public Yaprak getYaprak1() {
        return this.yaprak1;
    }

    public void setYaprak1(Yaprak yaprak1) {
        this.yaprak1 = yaprak1;
    }

    public Sap getSap1() {
        return this.sap1;
    }

    public void setSap1(Sap sap1) {
        this.sap1 = sap1;
    }



    public Cicek(String rengi, Yaprak yaprak1, Sap sap1){
        this.rengi = rengi;
        this.yaprak1 = yaprak1;
        this.sap1 = sap1;
    }
}