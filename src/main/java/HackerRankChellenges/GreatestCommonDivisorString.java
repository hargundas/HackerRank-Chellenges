package HackerRankChellenges;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GreatestCommonDivisorString {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int gcdLength = gcd(str1.length(), str2.length());
        System.out.println(str1.substring(0, gcdLength));

        return IntStream.range(0, gcdLength)
                .mapToObj(i -> String.valueOf(str1.charAt(i)))
                .collect(Collectors.joining());
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
//
//    public static String findShortestRepeatedSequence(String input) {
//        int length = input.length();
//
//        // Check for sequences of length 1 to half of the input length
//        for (int i = 1; i <= length / 2; i++) {
//            String sequence = input.substring(0, i);
//            int sequenceLength = sequence.length();
//
//            boolean isRepeated = true;
//
//            // Check if the entire input can be constructed by repeating the sequence
//            for (int j = 0; j < length; j += sequenceLength) {
//                if (!input.substring(j, Math.min(j + sequenceLength, length)).equals(sequence)) {
//                    isRepeated = false;
//                    break;
//                }
//            }
//
//            if (isRepeated) {
//                return sequence;
//            }
//        }
//
//        return input; // If no repeated sequence found, return the original string
//    }
//
//    public static String gcdOfStrings(String str1, String str2) {
//        String found = "";
//        boolean duplicateFound = false;
//        String[] testCommon = str2.split("\\s+");
//
//        String common = findShortestRepeatedSequence(str2);
//        if(str1.length() % common.length() == 0){
//            int repeat = str1.length() / common.length();
//            String repatedString = String.valueOf(common).repeat(repeat);
//            if(repatedString.equals(str1)){
//                duplicateFound=false;
//            }else{
//                duplicateFound=true;
//            }
//        }
//
//        for(int i =0;i < common.length() ; i++){
//            if(duplicateFound){
//                break;
//            }
//            if(str1.contains(common)){
//                found = common;
//            }
//        }
//        System.out.println(found);
//        return found;
//    }

    public static void main (String[] args){
        gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");

    }
        }
