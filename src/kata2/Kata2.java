package kata2;

import java.util.HashMap;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class Kata2 {

    public static void main(String[] args) {
        int [] data = new int[]{1,2,3,4,5,6,7,8,9,2,4,5,3,6,8};
        histogram histo = new histogram(data);    
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
        
        
        
    }
    
}
