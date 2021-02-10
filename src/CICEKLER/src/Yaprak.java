public class Yaprak {
    
    private int sayisi;
    private String sekli;
    private String rengi;


    
    public int getSayisi() {
        return this.sayisi;
    }

    public void setSayisi(int sayisi) {
        this.sayisi = sayisi;
    }

    public String getSekli() {
        return this.sekli;
    }

    public void setSekli(String sekli) {
        this.sekli = sekli;
    }

    public String getRengi() {
        return this.rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }






    public void acil(){
        System.out.println("Yapraklar açıldı.");
    }


    public Yaprak(int sayisi, String sekli, String rengi){

        this.sayisi = sayisi;
        this.sekli = sekli;
        this.rengi = rengi;
    }

}
