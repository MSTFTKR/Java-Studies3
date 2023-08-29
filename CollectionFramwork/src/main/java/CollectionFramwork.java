
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author musta
 */
public class CollectionFramwork {

    public static void main(String[] args) {
        //ArrayList<String> arraylist=new ArrayList<String>();
        List<String> list =new ArrayList<String>();
        
        list.add("Python");
        list.add("Python1");
        list.add("Python2");
        
        System.out.println(list.indexOf("Python1"));
        System.out.println(list.get(0));
        
        for(int i=0; i<list.size(); i++){
        
            System.out.println(list.get(i));
        }
    }
}
