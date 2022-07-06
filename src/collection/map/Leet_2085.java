package collection.map;
import java.util.HashMap;
import java.util.Map;

public class Leet_2085 {
    public int wordCount(String[]word1,String[]word2){
        int count = 0;
        HashMap<String,Integer>map1 = new HashMap<>();
        HashMap<String,Integer>map2 = new HashMap<>();

        for(int i = 0;i<word1.length;i++){
            map1.put(word1[i],map1.getOrDefault(word1[i], 0) +1);

        }
        for (int j = 0;j<word2.length;j++){
            map2.put(word2[j],map2.getOrDefault(word2[j],0) +1);

        }
        for(Map.Entry<String,Integer> entry:map1.entrySet()){
            String key =  entry.getKey();
            if (map2.containsKey(key)) {
                int map2Value = map2.get(key);
                if(map1.get(key) == map2Value && map2Value == 1) {
                    System.out.println(key);
                    count++;
                }
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Leet_2085 c = new Leet_2085();
        String[] word1 = {"leet","code","is"};
        String[] word2 = {"leet","is"};
        c.wordCount(word1,word2);
        System.out.println(c.wordCount(word1,word2));
    }

}



