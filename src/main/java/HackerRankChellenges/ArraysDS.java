package HackerRankChellenges;


import java.util.ArrayList;
import java.util.List;

//An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array, , of size , each memory location has some unique index,  (where ), that can be referenced as  or .
// Reverse an array of integers
//Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
public class ArraysDS {

    public static List<Integer> reverseArray() {
        // Write your code here
        List<Integer> a = List.of(1,4,3,2);
        int size = a.size();
        List<Integer> result = new ArrayList<>(size);
        for(int i =size -1 ; i >=0;i--){
            result.add(a.get(i));
        }
        return result;

    }
    public static void main (String[] args){

        List<Integer>  result =   reverseArray();
 
        System.out.println(result);
    }
}
