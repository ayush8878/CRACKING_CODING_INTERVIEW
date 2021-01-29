import java.util.Scanner;

class BitProgramming
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Integer Number:");
        int n = scanner.nextInt();
        System.out.println("Enter Bit Position:");
        int i = scanner.nextInt();

    }

    public static void getBit(int n,int i)
    {
        // When we do a left shift of 1 for the position where we need to find set bit only that position is filled 1 and all others are 0 and by doing & if result is non 0 means set bit
        System.out.println("Get Bit Result:"+ (((n & (1 << i)) !=0)?1:0));
    }
}