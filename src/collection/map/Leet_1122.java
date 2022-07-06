//Given two arrays arr1 and arr2, the elements of arr2 are distinct,
// and all elements in arr2 are also in arr1.
//Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
// Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

/*
package collection.hashmap;

import java.util.*;

public class Leet_1122 {
    public Integer[] sortArry(int[] arry1, int[] arry2) {
        List<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arry1.length; i++) {
            if (map.containsKey(arry1[i])) {
                int temp = map.get(arry1[i]);
                map.put(arry1[i], temp + 1);

            } else {
                map.put(arry1[i], 1);
            }
        }
        for (int j = 0; j < arry2.length; j++) {
            if (map.containsKey(arry2[j])) {
                int temp = map.get(arry2[j]); // it gives values of key arry[j]
                for (int i = 0; i < temp; i++) {  // run for loop on values so that if key is
                                                  // present 2 times then it will add 2 times in result.
                    result.add(arry2[j]);
                }

                map.remove(arry2[j]);
            }

        }
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(map); // to sort map elemets
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {


            result.add(entry.getKey());

        }

        return result.toArray(new Integer[0]);

        //return result;

    }

    public static void main(String[] args) {
        RelativeSortArray1122 r = new RelativeSortArray1122();
        int[] arry1 = {28, 6, 22, 8, 44, 17};
        int[] arry2 = {22, 28, 8, 6};

        System.out.println(Arrays.toString(r.sortArry(arry1, arry2)));

    }

}
 /*   public List<Integer> sortArry(int[] arry1, int[] arry2){
        List<Integer> list1 = convertArryToList(arry1);
        List<Integer> list2 = convertArryToList(arry2);
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i<list1.size();i++){

                int temp_variable = list1.get(i);
                if(list2.contains(temp_variable)){
                    result.add(temp_variable);
                }else {
                    temp.add(temp_variable);
                }


            }


        result.addAll(temp);
        return result;

    }
    public List<Integer> convertArryToList(int[] arry){
        //crrate empty list:
        List<Integer> list = new ArrayList<>();

        for(int i:arry){
            list.add(i);


        }
        return list;

    }

    public static void main(String[] args) {
        int[] arry1 = {4,2,6,1,6};
        int[] arry2 = {2,4,6};
        RelativeSortArray1122 r = new RelativeSortArray1122();

        System.out.println(r.sortArry(arry1,arry2));
    }

  */
//
