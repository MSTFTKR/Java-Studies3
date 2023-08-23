
package packages.accessmodifier;

public class Araba { ///default modifier(class Araba{}) sadece aynı package da çalışır.
    
        String model="Renault";
        String renk="Yeşil";
        String yil="2001";

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getYil() {
        return yil;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }
        
        
    
}
