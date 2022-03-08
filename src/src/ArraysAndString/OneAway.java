package src.src.ArraysAndString;

import java.util.Arrays;

public class OneAway {


    /**
     * This method will check if str1 is one away from str2 by performing insert,remove and replace
     * @param str1
     * @param str2
     * @return
     */
    public static boolean isOneAway(String str1,String str2)
    {
        if(str1 == null || str1.length() == 0 || str2 == null || str2.length() == 0)
        {
            return false;
        }
        int[] table = buildCharacterCountTable(str1);
        return isOneAway(str2,table);
    }

    /**
     * This method expects a string and table and check if str is one away from str2 by performing insert,remove and replace
     * @param str
     * @param table
     * @return
     */
    public static boolean isOneAway(String str,int[] table)
    {
        boolean isCharNotPresent = false;
        for(int i=0 ; i < str.length(); i++)
        {
          int pos = str.charAt(i) - 'a';
          if(table[pos]>0)
          {
              table[pos]--;
          }
          else
          {
              // If char not present then enable flag , if found that flag already enabled return false
              if(isCharNotPresent)
              {
                  return false;
              }
              isCharNotPresent = true;
          }
        }
        long remainingChars = Arrays.stream(table).filter(x -> x > 0).count();
        return (remainingChars > 1)?false:true;
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
    private static int[] buildCharacterCountTable(String str) {
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
         printOutput("pale","ple");
        printOutput("pales","pale");
        printOutput("pale","bale");
        printOutput("pale","bake");
    }

    private static void printOutput(String input1, String input2) {
        System.out.println("string "+ input1 + " is one away from "+input2+" = "+ isOneAway(input1,input2));
    }
}
