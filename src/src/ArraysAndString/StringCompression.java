package src.src.ArraysAndString;

public class StringCompression {

    /**
     * This method will provide the compressed sting out of the input sting
     * @param str
     * @return
     */
    public static String getCompressedString(String str)
    {
        if(str == null || str.length() ==0)
        return str;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1) != str.charAt(i))
            {
                sb.append(str.charAt(i-1));
                sb.append(++count);
                count = 0;
            }
            else
            {
                count++;
            }
        }
        if(count > 0)
        {
            sb.append(str.charAt(str.length()-1));
            sb.append(++count);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        printOutput("palee");
        printOutput("aabcccccaaa");
    }

    private static void printOutput(String input1) {
        System.out.println("string "+ input1 + " compressed sting is "+getCompressedString(input1) );
    }
}
