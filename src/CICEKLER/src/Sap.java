public class Sap {

    private boolean dikenleri_var_mi;
    private float uzunlugu;



    public boolean isDikenleri_var_mi() {
        return this.dikenleri_var_mi;
    }

    public void setDikenleri_var_mi(boolean dikenleri_var_mi) {
        this.dikenleri_var_mi = dikenleri_var_mi;
    }

    public float getUzunlugu() {
        return this.uzunlugu;
    }

    public void setUzunlugu(float uzunlugu) {
        this.uzunlugu = uzunlugu;
    }
       
    

    public Sap( boolean dikenleri_var_mi, float uzunlugu){
        this.dikenleri_var_mi = dikenleri_var_mi;
        this.uzunlugu = uzunlugu;
    }



    public void donme(float saat){


        if(saat < 19 && saat > 6){
            System.out.println("Güneşe doğru dönüldü.");
        }

        else{
          System.out.println("Güneş yok.");  
        }

        

    }

}
