package ArraysAndString;

import java.util.Arrays;

public class CheckPermutation {

    static boolean isPermutation(String s1,String s2)
    {
        if(s1 == null || s2 == null || s1.length() != s2.length())
        {
            return false;
        }
        int[] charCount = new int[256];
        // insert s1 in array
        for(int i=0;i<s1.length();i++)
        {
            int index = s1.charAt(i);
            charCount[index] = charCount[index]+1;
        }
        // remove s2 from array
        for(int i=0;i<s2.length();i++)
        {
            int index = s2.charAt(i);
            if(index>0)
            charCount[index] = charCount[index]-1;
        }
        long nonZeroChar = Arrays.stream(charCount).filter(x -> x!=0).count();
        if(nonZeroChar>0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public static void main(String[] args) {
        System.out.println("AYUSH and YUSHA" + " is Permutation:"+ isPermutation("AYUSH","YUSHA"));
        System.out.println("AYUSH and YUSHAA" + " is Permutation:"+ isPermutation("AYUSH","YUSHAA"));
        System.out.println("AYUSH and YASHA" + " is Permutation:"+ isPermutation("AYUSH","YASHA"));
    }
}
