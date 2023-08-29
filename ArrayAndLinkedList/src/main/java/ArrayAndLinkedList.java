
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayAndLinkedList {

    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        LinkedList<Integer> linked=new LinkedList<Integer>();
        
        zamanHesapla("ArrayList", array);
        zamanHesapla("LinkedList", linked);
        
        
    }
    
    public static void zamanHesapla(String veriTipi,List<Integer>list){
        long begin;
        long finish;
        
        begin=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
            
        }
        finish=System.currentTimeMillis();
        
        System.out.println(veriTipi+" ekleme süresi: "+ (finish-begin)+" ms");
    }
}
