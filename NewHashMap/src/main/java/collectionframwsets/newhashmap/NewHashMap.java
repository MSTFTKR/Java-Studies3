
package collectionframwsets.newhashmap;

import java.util.HashMap;
import java.util.Map;

public class NewHashMap {

    public static void main(String[] args) {
        System.out.println("What's HashMap");
        
        HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        
        hashMap.put(Integer.SIZE, "Javax");
        hashMap.put(10, "Javax");
        hashMap.put(12, "value");
        hashMap.put(113, "mustafa");
        hashMap.put(23, "degerli");
        hashMap.put(113, "mustafa****");
       /* System.out.println(hashMap);
        
        
        System.out.println(hashMap.get(113));
        System.out.println(hashMap.get(110));*/
       
       for (Map.Entry<Integer,String> a: hashMap.entrySet()){
           
           System.out.println(a.getKey()+":"+a.getValue());
       
       
       
       }
        
        
    }
}
