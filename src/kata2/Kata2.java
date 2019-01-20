package kata2;

import java.util.HashMap;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class Kata2 {

    public static void main(String[] args) {
        String [] data = {"Maria","Pepe","Rosa","Juan","Pepe","Pepe","Rosa"};
        histogram histo = new histogram(data);    
        Map<String, Integer> histogr = histo.getHistogram();
        for (String key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
