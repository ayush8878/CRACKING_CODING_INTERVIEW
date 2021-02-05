package leetcode;

import java.util.Arrays;

public class CountingBits_P338 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CountingBits_P338().countBits(5)));
    }

    public int[] countBits(int num) {
        int i=0;
        int[] counts = new int[num+1];
        while(i<=num)
        {
            counts[i] = hammingWeight(i);
            i++;
        }
        return counts;
    }

    public int[] countBits2(int num) {
        int[] counts = new int[num+1];
        int i=0;
        counts[i]=0;
        if(num == 0)
            return counts;
        counts[1]=1;
        i=2;
        while(i<=num)
        {
            counts[i] = counts[i<<2];
            if(i%2==0)
                counts[i]++;
            i++;
        }
        return counts;
    }
    public int hammingWeight(int n) {
        int count = 0;
        //By doing and with n-1 rightmost set bit get sets to 0 and everything other remains same , by doing and number is further reduced
        while(n > 0)
        {
            count ++;
            n = n & (n-1);
        }    return count;
    }
}
