//package HackerRankChellenges;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Stream;
//
//public class LongestSubstring {
//    public static int lengthOfLongestSubstring(String s) {
//
////         int num = (int) Stream.of(s).filter(x->x.equals(x)).distinct().count();
////        System.out.println(num);
//
//        char sameFound = 0;
//        Set<Character> charList = new HashSet<>();
//        char[] list =  s.toCharArray();
//        for(int i = 0 ; i <=list.length;i++){
//
//            if(sameFound==list[i]){
////                if( list[i] == list){
////                    break;
////                }
//           continue;
//            }else{
//                charList.add(c);
//                sameFound = c;
//
//            }
//        }
//        return charList.size();
//    }
//    public static  void main (String[] args){
//        lengthOfLongestSubstring("pwwkew");
//    }
//}
