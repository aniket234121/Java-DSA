package dsa.String;

//Given an input string s, reverse the order of the words.
//
//A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//Return a string of the words in reverse order concatenated by a single space.
//
//Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
//
//
//
//Example 1:
//
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.
//Example 3:
//
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

public class stringReverseWords {
//    Brute Force Approach.
//    public static String reverseWords(String s) {
//        s=s.trim();
//
//        String res="";
//        String[] str = s.split("\\s+");
//
//        int i=0;
//        int j=str.length-1;
//        while(i<=j)
//        {
//
//
//            String temp=str[i];
//            str[i]=str[j].trim();
//            str[j]=temp.trim();
//            i++;
//            j--;
//        }
//        for(i=0;i<str.length;i++){
//            res+=str[i];
//
//            if(i!=str.length-1){
//                res+=" ";
//            }
//        }
//        return res;
//    }

    //reverse function
    private static void reverse(StringBuilder sb, int start, int end) {

        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public static String reverseWords(String s) {
        s = s.strip();//remove all leading and trailing spaces

        StringBuilder sb = new StringBuilder(s).reverse();


        for (int i = 0; i < sb.length(); i++) {


            int j = i;
            while (i < sb.length() && sb.charAt(i) != ' ') {

                i++; //moving i till space is found

            }
            //we are at space index now
            int e = i - 1; //go back to where there was a letter

            reverse(sb, j, e); //got both index and reversed


        }
        //replace all spaces with single space
        return sb.toString().replaceAll(" +", " ");
    }
        public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
