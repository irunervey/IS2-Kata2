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
public class histogram {
    private int[] data;

    public histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    public Map getHistogram(){
        Map<Integer, Integer> histogram = new HashMap<Integer,Integer>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) 
                    ? histogram.get(key)+1:1);
        }
        return histogram;
    }
    
}