package tasks;

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


}
