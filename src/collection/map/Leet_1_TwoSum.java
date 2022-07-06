package collection.map;

import java.util.Arrays;
import java.util.HashMap;

public class Leet_1_TwoSum {
    public int[] twoSum(int[]arry,int target){
        HashMap<Integer,Integer>indexmap = new HashMap<>();

        for(int i = 0;i<arry.length;i++){
            Integer num = (target - arry[i]);
            if(indexmap.containsKey(num)){
                int[] toReturn =  {indexmap.get(num),i};
                return toReturn;

            }
            indexmap.put(arry[i],i);

        }
        return null;

    }

    public static void main(String[] args) {
        Leet_1_TwoSum l2 = new Leet_1_TwoSum();
        int[] arry = {1,2,5,4};
        int targer = 3;

        int[] twoSum = l2.twoSum(arry, targer);
        System.out.println(Arrays.toString(twoSum));
    }
}
