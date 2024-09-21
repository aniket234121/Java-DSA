package dsa.String;

public class LargestOddNumberInString {

//    You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
//
//    A substring is a contiguous sequence of characters within a string.
//
//
//
//    Example 1:
//
//    Input: num = "52"
//    Output: "5"
//    Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
//            Example 2:
//
//    Input: num = "4206"
//    Output: ""
//    Explanation: There are no odd numbers in "4206".
//    Example 3:
//
//    Input: num = "35427"
//    Output: "35427"
//    Explanation: "35427" is already an odd number.

    public static String largestOddNumber(String num) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<num.length();i++)
        {
            if(((int)num.charAt(i)^1) <(int)num.charAt(i)){
                max=Character.getNumericValue(num.charAt(i));
                index=i;
            }
        }
        if(index==-1 && max!=Integer.MIN_VALUE)
        {
            return ""+max;
        }
        else if(max==Integer.MIN_VALUE)
        {
            return "";
        }
        return num.substring(0,index+1);
    }

    public static void main(String[] args)  {
    System.out.println(largestOddNumber("1240"));
    }
}
