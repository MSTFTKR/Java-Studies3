
package AccessModifier2;

import packages.accessmodifier.Animal;
import packages.accessmodifier.Araba;

public class Main {
    public static void main(String[] args) {
        
    
//    Araba araba=new Araba();
//        System.out.println(araba.model);
//        System.out.println(araba.renk);
//        System.out.println(araba.yil);
            Animal animal=new Animal("DülDüll");
            Horse horse=new Horse("DülDül");
            System.out.println(horse.sayName(animal));
    }
}

