package kata2;

import java.util.HashMap;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = new int[]{1,2,3,4,5,6,7,8,9,2,4,5,3,6,8};
        Map<Integer, Integer> histogram = new HashMap<Integer,Integer>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) 
                    ? histogram.get(key)+1:1);
        }         
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
        
        
    }
    
}
