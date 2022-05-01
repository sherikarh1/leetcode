//Given an array of integers arr, return true if the number of occurrences of
// each value in the array is unique, or false otherwise.


package collection.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leet_1207 {
    public boolean isUnique(int[]arry){
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i = 0;i<arry.length;i++){
            if(map.containsKey(arry[i])){
              int temp =   map.get(arry[i]);
              map.put(arry[i],temp+1);
            }else{
                map.put(arry[i],1);

            }
        }
        HashSet<Integer>set = new HashSet<>();
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            int count = entry.getValue();
              boolean isAdded =   set.add(count);
              if(!isAdded){
                  return false;
              }

        }
        return true;
    }

    public static void main(String[] args) {
        Leet_1207 l = new Leet_1207();
        int[]arry = {1,2};

        System.out.println(l.isUnique(arry));


    }
}
