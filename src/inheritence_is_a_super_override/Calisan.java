package inheritence_is_a_super_override;

public class Calisan {
    private String ad;
    private String soyad;
    private int id;


    public Calisan(String ad, String soyad, int id ) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }


    public void bilgileriGoster(){
        System.out.println("-Çalışan Bilgileri-");
        System.out.println("İsim: " + ad);
        System.out.println("Soyisim: " + soyad);
        System.out.println("id: " + id);
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}