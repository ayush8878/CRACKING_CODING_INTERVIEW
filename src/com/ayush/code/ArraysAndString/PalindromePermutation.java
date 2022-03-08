package src.com.ayush.code.ArraysAndString;

public class PalindromePermutation {

    /**
     * This method will check if palindrome permutations of string are possible
     * @param str
     * @return
     */
    public static boolean isStringPermutationPalindrome(String str)
    {
        if(str == null || str.length() == 0)
        {
            return false;
        }
        int[] table = buildCharacterTable(str);
        return checkPalindromePermutationPresent(table);
    }

    /**
     * This method will check palindrome permutations of string are possible using generated table
     * @param table
     * @return
     */
    private static boolean checkPalindromePermutationPresent(int[] table) {
        boolean isOddChar = false;
        for(int i = 0;i<table.length;i++)
        {
            if(table[i] % 2 == 1)
            {
                if(!isOddChar)
                {
                    isOddChar = true;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * This method will build a character table
     * @param str
     * @return
     */
    private static int[] buildCharacterTable(String str) {
        int start = 0;
        int end = 'z' - 'a';
        int[] table = new int[end];
        for(int i=0;i<str.length();i++)
        {
            int charPosition = getCharPosition(str.charAt(i));
            table[charPosition]++;
        }
        return table;
    }

    private static int getCharPosition(char ch) {
        int start = 'a';
        int end = 'z';
        if(ch >= start || ch<= end)
        {
            return ch - start;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("string aabbb has palindrome permutations = "+isStringPermutationPalindrome("a"));
    }
}
