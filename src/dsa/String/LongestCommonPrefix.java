package dsa.String;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length==1)
        {
            return strs[0];
        }

        int min=Integer.MAX_VALUE;
        for (String str : strs) {
               if(str.length()<min)
               {
                   min=str.length();
               }
        }

        boolean hasCommon=true;
        int mainCount=0;
        int count=0;
        String st="";
        for(int i=0;i<min;i++)
        {
            if(!hasCommon)
            {
                break;
            }
            char val=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++)
            {
                if(val==strs[j].charAt(i))
                {
                    count++;
                }else{

                    hasCommon=false;
                    break;
                }

            }
            if(count==strs.length)
            {
                mainCount++;
                count=0;
                st+=val;
            }
        }
        return st;

    }

    public static void main(String[] args) {
        String []str={"ab", "a"};
        System.out.println(longestCommonPrefix(str));
    }
}
