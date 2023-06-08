package HackerRankChellenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrays {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings1(List<String> strings, List<String> queries) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        int strSize = strings.size(),queSize=queries.size();

        // ab ab abc
        // ab abc bc

        for(int i=0 ; i<queSize;i++){
            int count =0;
            //System.out.println(queries.get(i));
            for (int j = 0; j<strSize ; j++){
               // System.out.println(queries.get(i) +"  :  "+strings.get(j));
                if (strings.get(j).equals(queries.get(i))){
                     count ++;
                 }
            }
            result.add(count);
        }

//        System.out.println(result);

        return  result;
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
        return queries.stream().map(query ->(int) strings.stream().
                filter(str ->str.equals(query)).count()).collect(Collectors.toList());
    }


    public static void main (String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");

        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        matchingStrings(strings,queries);

    }

}
