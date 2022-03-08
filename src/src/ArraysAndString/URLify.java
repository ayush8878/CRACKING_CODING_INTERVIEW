package src.src.ArraysAndString;

public class URLify {

    static String urlify(String str,int actualLength)
    {
        char[] output = new char[str.length()];
        char[] arr = str.toCharArray();
        int outputIndex = -1;
        for(int i=0;i<actualLength;i++)
        {
            char currentChar = arr[i];
            if(currentChar == ' ')
            {
                output[++outputIndex]='%';
                output[++outputIndex]='2';
                output[++outputIndex]='0';
            }
            else
            {
                output[++outputIndex]=currentChar;
            }
        }
        return String.valueOf(output);
    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        String urlifiedString = urlify(str,13);
        System.out.println("Urlified version of "+str+" is "+urlifiedString);
    }
}
