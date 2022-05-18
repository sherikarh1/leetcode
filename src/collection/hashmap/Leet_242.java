package collection.hashmap;

import java.util.Arrays;

public class Leet_242 {
    public boolean anagramWord(String name,String anagram_name){

        char[] name1 = name.toCharArray();
        char[] anagram_name1 = anagram_name.toCharArray();
        if(name.length()!= anagram_name.length()){
            return false;
        }

        Arrays.sort(name1);
        Arrays.sort(anagram_name1);

        for(int i = 0; i< name1.length; i++ ){
           if(name1[i] != anagram_name1[i]) {
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {
        Leet_242 l1 = new Leet_242();
        String name = "anagram";
        String anagram_name = "nagaram";

        System.out.println(l1.anagramWord(name,anagram_name));

    }
}
