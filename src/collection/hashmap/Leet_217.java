package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Leet_217 {
    public boolean duplicate(int[] arry){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<arry.length;i++){
            if(map.containsKey(arry[i])){

                 return true;

            }else
                map.put(arry[i],1);

        }
        return false;

    }

    public static void main(String[] args) {
        Leet_217 l = new Leet_217();
        int[]arry = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(l.duplicate(arry));

    }
}
