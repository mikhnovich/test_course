package tasks;

import java.util.Arrays;

public class Tasks {

//    Given two strings, a and b, return the result of putting them together in the order abba,
//    e.g. "Hi" and "Bye" returns "HiByeByeHi".
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }


//   Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
//    bobThere("b9b") → true
    public static boolean bobThere(String str) {
        for (int i = 0; i <= str.length()-3; i++){
            if (str.substring(i,i+1).equals("b")&&str.substring(i+2,i+3).equals("b")){
                return true;
            }
        }
        return false;
    }

//  Return true if the string "cat" and "dog" appear the same number of times in the given string.
//  catDog("catdog") → true
//  catDog("catcat") → false
    public static boolean catDog(String str) {
        int count_cat = 0;
        int count_dog = 0;
        for (int i = 0; i < str.length()-2; i++){
            if (str.substring(i,i+3).equals("cat")){
                count_cat++;
            }
            if (str.substring(i,i+3).equals("dog")){
                count_dog++;
            }
        }

        return count_cat == count_dog;
    }


//   Given a string, return a string where for every char in the original, there are two chars.
//   doubleChar("The") → "TThhee"
    public static String doubleChar(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i< str.length(); i++){
            res.append(str.charAt(i)).append(str.charAt(i));
        }
        return res.toString();
    }

//   Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//   nonStart("Hello", "There") → "ellohere"
    public static String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }


//    Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//    sum28([2, 3, 2, 2, 4, 2]) → true
//    sum28([2, 3, 2, 2, 4, 2, 2]) → false
    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i< nums.length; i++){
            if (nums[i]==2){
                sum+=nums[i];
            }
        }
        if (sum == 8){
            return true;
        }
        return false;
    }

//    Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
//    so it does not count and numbers that come immediately after a 13 also do not count.
//    sum13([1, 2, 2, 1]) → 6
//    sum13([1, 1]) → 2
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i< nums.length;  i++){
            if (nums[i] == 13 || (i>0 && nums[i-1] == 13)){
                continue;
            } else {
                sum+=nums[i];
            }
        }
        return sum;
    }


//    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
//    has22([1, 2, 2]) → true
//    has22([1, 2, 1, 2]) → false
    public static boolean has22(int[] nums) {
        for (int i =0; i < nums.length-1; i++){
            if (nums[i]==2 && nums[i+1]==2){
                return true;
            }
        }
        return false;
    }


//    Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
//    The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for
//    the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
//    The syntax to make a new int array is: new int[desired_length]
//    fizzArray(4) → [0, 1, 2, 3]
//    fizzArray(1) → [0]
    public static int[] fizzArray(int n) {
        int [] a = new int [n];
        for (int i= 0; i < n; i++){
            a[i]= i;
        }
        return a;
    }



//    Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
//    centeredAverage([1, 2, 3, 4, 100]) → 3
//    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    public static int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.length-1; i++){
            res+= nums[i];
        }
        return res/(nums.length-2);

    }

}
