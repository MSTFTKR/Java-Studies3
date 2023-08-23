/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class StaticClass {
    public static  int obje_sayisi = 0;
    private static String isim;
    
    public StaticClass(String isim) {
        this.isim = isim;
        
        obje_sayisi++;
        
    }
    public static String getIsim() {
        return isim;
        
    }
}
