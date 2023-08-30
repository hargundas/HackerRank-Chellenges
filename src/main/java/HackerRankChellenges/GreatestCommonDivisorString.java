package HackerRankChellenges;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GreatestCommonDivisorString {
    public static String gcdOfStrings(String str1, String str2) {
        String found = "";
        boolean duplicateFound = false;
        String common = str2.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());

        if(str1.length() % common.length() == 0){
            int repeat = str1.length() / common.length();
            String repatedString = String.valueOf(common).repeat(repeat);
            if(repatedString.equals(str1)){
                duplicateFound=false;
            }else{
                duplicateFound=true;
            }
        }

        for(int i =0;i < common.length() ; i++){
            if(duplicateFound){
                break;
            }
            if(str1.contains(common)){
                found = common;
            }
        }
        System.out.println(found);
        return found;
    }

    public static void main (String[] args){
        gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX","TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");

    }
        }
