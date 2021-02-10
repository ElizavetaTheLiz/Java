public class Test {

    public static void main(String[] args) {
        
        Sap sapimiz = new Sap(true, 10.5f);
        Yaprak yapraklar = new Yaprak(5, "kalp", "koyu yeşil");
        Gul gul1 = new Gul("kırmızı", yapraklar, sapimiz, "güzel");


        gul1.getYaprak1().acil();
        gul1.getSap1().donme(15.53f);


        gul1.getSap1().setUzunlugu(11f);
        gul1.getYaprak1().setSayisi(7);
        

        System.out.println("uzunluk : " + gul1.getSap1().getUzunlugu());
        System.out.println("yaprak sayisi : " + gul1.getYaprak1().getSayisi());



    }
    
}
