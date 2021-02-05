package leetcode;

public class NumberOf1Bits_P191 {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n1) {
                long n=Integer.toUnsignedLong(n1);
                int count = 0;
                //By doing and with n-1 rightmost set bit get sets to 0 and everything other remains same , by doing and number is further reduced
                while(n > 0)
                {
                    count ++;
                    n = n & (n-1);
                }    return count;
        }
    }