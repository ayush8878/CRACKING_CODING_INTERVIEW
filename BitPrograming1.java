import java.util.Scanner;

class BitProgramming
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Integer Number:");
        int n = scanner.nextInt();
        System.out.println("Enter Bit Position:");
        int i = scanner.nextInt();
        System.out.println("Choose Operation:");
        String opType = scanner.next();
        switch (opType)
        {
            case "get":
            {
                getBit(n,i);
                break;
            }
            case "set":
            {
                setBit(n,i);
                break;
            }
            case "countset":
            {
                countSetBit(n,i);
                break;
            }
            case "countset2":
            {
                countSetBit2(n,i);
                break;
            }


        }

    }

    public static void getBit(int n,int i)
    {
        // When we do a left shift of 1 for the position where we need to find set bit only that position is filled 1 and all others are 0 and by doing & if result is non 0 means set bit
        System.out.println("Get Bit Result:"+ (((n & (1 << i)) !=0)?1:0));
    }

    public static void setBit(int n,int i)
    {
        // When we do a left shift of 1 for the position where we need to find set bit only that position is filled 1 and all others are 0 and doing | of this that particular bit gets set
        n = n | (1 << i);
        System.out.println("Set Bit Result:"+ n);
    }

    public static void countSetBit(int n,int i)
    {
        int count = 0;
        // Right shift number one by at the end and perform and with 1
        while(n > 0)
        {

            if(((n % 2) & 1) > 0)
            count++;
            n = n >> 1;

        }
        System.out.println("Count of set bit:"+ count);
    }

    public static void countSetBit2(int n,int i)
    {
        int count = 0;
        //By doing and with n-1 rightmost set bit get sets to 0 and everything other remains same , by doing and number is further reduced
        while(n > 0)
        {
            count ++;
            n = n & (n-1);
        }
        System.out.println("Count of set bit:"+ count);
    }
}