
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class CollectionFramwSets {

    public static void main(String[] args) {
        
        
        
        
        
        /*
        Set<String> set1=new HashSet<String>();
        Set<String> set2=new LinkedHashSet<String>();
        Set<String> set3=new TreeSet<String>();

        set1.add("Mustafa");
        set1.add("Ali");
        set1.add("Ramazan");
        set1.add("hüse  ");
        set1.add("danı");
        
        set2.add("Mustafa");
        set2.add("Ali");
        set2.add("Ramazan");
        set2.add("hüse  ");
        set2.add("danı");
        
        set3.add("Mustafa");
        set3.add("Ali");
        set3.add("Ramazan");
        set3.add("hüse  ");
        set3.add("danı");
        System.out.println("--------HashSet-------");
        for(String s:set1){
        
            System.out.println(s);}
        
        
        System.out.println("--------LinkedHashSet-------");
        for(String s:set2){
        
            System.out.println(s);}
        
        
        System.out.println("--------TreeSet-------");
        for(String s:set3){
        
            System.out.println(s);}
        
        
        System.out.println("içinde var mı? :"+set1.contains("Ali"));
        
        System.out.println(set1.isEmpty()); //boş mu
        
        */
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
    
        set1.add("Java");
        set1.add("C++");
        set1.add("Python");
        set1.add("Javascript");
        set1.add("Php");
    
        set2.add("Go");
        set2.add("Java");
        set2.add("CSS");
    
    
       /* Set<String> fark = new HashSet<String>(set2);
    
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);*/
       
        Set<String> ortak = new HashSet<String>(set2);
        System.out.println(ortak.retainAll(set1));

        System.out.println(ortak);
       
  
    }
}
