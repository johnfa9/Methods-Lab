package com.company;

import java.lang.Math;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println(maxOfTwoNumbers(788, 987));
        System.out.println((maxOfThree(87,67,43)));
        System.out.println((isCharacterAVowel('a')));
        System.out.println((numberOfArgs(8,9,7,7)));
        System.out.println(reverseString("john"));
    }

    static int maxOfTwoNumbers(int first, int second){
        if (first>second){
            return first;
        }
        else {
            return second;
        }
    }

    static int maxOfThree(int first,int second, int third){
        return Math.max(third,Math.max(first,second));
    }
    static boolean isCharacterAVowel(char value){
        ArrayList<Character> arr = new ArrayList<Character>(5);
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');
        if (arr.indexOf(value)!=-1){
            return true;
        }
        else return false;
    }

    static int numberOfArgs(int ... a){
        return a.length;
    }
    static String reverseString(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}
