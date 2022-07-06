// Find and display number of duplicate occurences of word in String.

package collection.map;


import java.util.HashMap;
import java.util.Map;

public class Leet_duplicateWords {
    public static void findDuplicate(String words){
        String[] arry = words.split(" ");
        HashMap<String,Integer>map = new HashMap<>();

        for(int i = 0;i<arry.length;i++){
            if(map.containsKey(arry[i])){
                int temp = map.get(arry[i]);
                map.put(arry[i],temp+1);

            }else {
                map.put(arry[i],1);
            }
        }
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                String temp1 = entry.getKey();
                System.out.println("The word " +temp1 + " occures " +entry.getValue());

            }
        }



    }

    public static void main(String[] args) {
        String words = "I am am java learner";
        findDuplicate(words);
    }
}
