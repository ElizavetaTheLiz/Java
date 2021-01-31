package Composition_has_a;


public class Monitor {
    
    private String model;
    private String uretici;
    private String boyut;
    private Resolution resolution;

    //constructor + composition by using resolution
    public Monitor(String model, String uretici, String boyut, Resolution resolution) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resolution = resolution;
    }


    //method
    public void monitoru_kapat() {
        
        System.out.println("Monitor Kapatılıyor....");
    }


    //method
    public void monitoru_ac() {

        System.out.println("Monitor Açılıyor....");
    }


    //getters and setters
    public String getModel() {
        return model;
    }
    public void setModel(String model) {this.model = model;}
    public String getUretici() {
        return uretici;
    }
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }
    public String getBoyut() {
        return boyut;
    }
    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
    public Resolution getResolution() {
        return resolution;
    }
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
