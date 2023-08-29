
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class HashMapLinkedHashMapTreeMap {

    public static void main(String[] args) {
        
        Map<Integer,String> hashmap=new HashMap<Integer,String>();
        Map<Integer,String> LinkedHashmap=new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap=new TreeMap<Integer,String>();
        
       
        MapYaz(hashmap);
        System.out.println("----------------");
        MapYaz(LinkedHashmap);
        System.out.println("++++++++++++++++");
        MapYaz(treeMap);
        
        
        
    }
    
    public static void MapYaz(Map<Integer,String> map){
        
            map.put(20,  "Java");
            map.put(10,  "php");
            map.put(5,  "css");
            map.put(4,  "phyt");
            map.put(3,  "c+");
            
            /*for(Map.Entry<Integer,String> a: map.entrySet()){
            
                System.out.println("key: "+a.getKey()+" değer: "+a.getValue());
            
            
            }*/
            
            //System.out.println(map.keySet());
            for(Integer key: map.keySet()){
            System.out.println("Key:"+key+" değer:"+map.get(key));
            }
            
            Collection<String>values=map.values();
            
            for (String s : values) {
                System.out.println(s);  
        }
    }
}
