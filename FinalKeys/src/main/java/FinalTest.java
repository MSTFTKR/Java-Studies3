
public class FinalTest {
    public final int objeSayisi;         //final sadece başlangıçta yada constructorda değer alır
    
    private static int say=0;
    private final String isim;

    public FinalTest(String isim) {
        
        this.isim = isim;
        say++;
        objeSayisi=say;
    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
            
            
            
    
    
    
    
    
    
    
    
}
