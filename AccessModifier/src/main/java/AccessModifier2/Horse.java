
package AccessModifier2;

import packages.accessmodifier.Animal;

public class Horse extends Animal{
    
    public Horse(String isim) {
        super(isim);
    }
    public void sayName(Animal isim){
        System.out.println(super.isim);
    }
}
