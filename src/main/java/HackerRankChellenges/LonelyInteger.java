package HackerRankChellenges;

import java.util.*;

public class LonelyInteger {


    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
             int result = 0;
        //using reduce function apply XOR gate logic
           result = a.stream().reduce(0,(integer, integer2) -> integer ^ integer2);
        //1 2 3 4 3 2 1
//        Set<Integer> aSet = new HashSet<>();
//        aSet.addAll(a);
//
        return result;
    }

    public static  void main (String args[]){
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(1);
        numList.add(2);
        numList.add(3);
        lonelyinteger(numList);



    }



}
