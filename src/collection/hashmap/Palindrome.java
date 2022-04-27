package collection.hashmap;

public class Palindrome {
    public boolean isPalindeome(String words){
        String rev = "";

        for (int i = words.length()-1;i>=0;i--){
            rev = rev + words.charAt(i);

        }
        if(rev.equals(words)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String word = "palindrom";

        System.out.println(p.isPalindeome(word));


    }
}
