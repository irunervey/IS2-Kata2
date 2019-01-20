/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class histogram<T> {
    private T[] data;

    public histogram(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
    public Map getHistogram(){
        Map<T, Integer> histogram = new HashMap<T,Integer>();
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) 
                    ? histogram.get(key)+1:1);
        }
        return histogram;
    }
    
}