package com.zipcodewilmington;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int whatever = (array.length - 1);
        String ans = array[whatever];
        return ans;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int whatever = array.length - 2;
        String ans = array[whatever];
        return ans;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        // String whatever = value;
        boolean ans = false;
        //  for (int i=0; i < array.length; i++) {
        for (String i : array) {
            if (value.equals(i)) {
                ans = true;
            }
        }
        return ans;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] s = new String[array.length];
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            s[i++] = array[j];
        }
        return s;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        // String[] what = new String[array.length-1];
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] iWantToCry = new boolean[26];

        for (int j = 0; j < array.length; j++) { //this checks each word
            for (int k = 0; k < array[j].length(); k++) { //this checks each character in each word
                char curChar = array[j].toLowerCase().charAt(k);

                if (curChar >= 'a' && curChar <= 'z') { // if it's a letter
                    iWantToCry[curChar - 'a'] = true; //uwu -97 uwu bc a = 97 z = 122
                } // :3
            }
        }

        for (int i = 0; i < iWantToCry.length; i++) {
            if (iWantToCry[i] == false) {
                return false;
            }
        } //
//
        return true;
    }

    //  int curWordLetter = 0;
    //  int curAlphabetLetter = 0;
    // int curWord = 0;
//        int numbers =
//        for (int curWord = 0; curWord < array.length; curWord++) {
//            for (int curWordLetter = 0; curWordLetter < array[curWord].length(); curWordLetter++) {
//               // for (int curAlphabetLetter = 0; curAlphabetLetter < 26; curAlphabetLetter++) {
//                    if (alphabet.contains(array[curWord].split("")[curWordLetter])) {
//                //    if (alphabet.charAt(curAlphabetLetter) != array[curWord].toLowerCase().charAt(curWorldLetter)) {
//
//                    }
//                }
//
//        }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        //String[] what = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                j++;
            }
        }
        return j;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] what = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (valueToRemove != array[i]) {
                what[j++] = array[i];
            }
        }

        return what;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
// StringBuilder ans = new StringBuilder();
//
//    for (int i = 1; i < array.length; i++) {
//        if (array[i] != array[i-1]) {
//            ans.append(array[i]);
//         //   i++;
//        } else {
//            ans.append(",");
//        }
//    }
//        return ans.toString().split(",");
//    }
//
        List<String> answer = new ArrayList<>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                answer.add(array[i-1]);
            }

        }
        answer.add(array[array.length-1]);
        String[] whatever = new String[answer.size()];
        whatever = answer.toArray(whatever);
        return whatever;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<>();

        newArray.add(array[0]);
        int index = 0;
        int sad = 0;
        for (int j = 1; j < array.length; j++){
        if (array[index] == array[j]) {
            newArray.set(sad, newArray.get(sad)+array[j]); //at index of sad, adding array value to the current value in the new array

        } else {
            index = j;
            sad ++;
            newArray.add(array[j]);

        }

    }
       // System.out.println(newArray);
       String[] answer = new String[newArray.size()];
        answer = newArray.toArray(answer);
        return answer;
    }
}



