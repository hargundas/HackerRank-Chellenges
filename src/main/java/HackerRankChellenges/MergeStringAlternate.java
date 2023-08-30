package HackerRankChellenges;

public class MergeStringAlternate {
    public static String mergeAlternately(String word1, String word2) {
        int word1Size = word1.length();
        int word2Size = word2.length();
        int size = 0;
        String result ="";
        if(word1Size > word2Size){
            size = word1Size;
        }else {
            size = word2Size;
        }


        for(int i = 0 ; i < size;i++){
             if(i < word1Size){
               result= result.concat(String.valueOf(word1.charAt(i)));
            }
            if (i < word2Size) {
                result= result.concat(String.valueOf(word2.charAt(i)));
            }
            System.out.println("result   :"+result );

        }

        return result;
    }

    public static void main (String args[]){
        mergeAlternately("abcd","pq");
    }

}
