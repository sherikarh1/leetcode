package collection.map;

public class Leet_1935 {
    public int fullTypedWord(String words, String broken_word) {
        String[] arr1 = words.split(" ");
        char[] arr2 = broken_word.toCharArray();
        boolean isBroken = false;
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].contains(String.valueOf(arr2[j]))) {// convert char arry into string.

                    isBroken = true;

                }


            }
            if (!isBroken)
                count++;


        }return count;

    }

    public static void main(String[] args) {
        Leet_1935 l = new Leet_1935();
        String word = "leet code";
        String broken = "lt";

        System.out.println(l.fullTypedWord(word, broken));


    }
}
