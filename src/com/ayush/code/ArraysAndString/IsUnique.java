package src.com.ayush.code.ArraysAndString;

public class IsUnique {

    public static boolean isUnique(String str)
    {
        if(str.length() > 256)
        {
            return false;
        }
        // Concidering all unique characters based on ASCII
        boolean[] charArr = new boolean[256];
        for(int i=0;i<str.length();i++)
        {
            int charIndex = str.charAt(i);
            boolean exists = charArr[charIndex];
            if(exists)
            {
                return false;
            }
            else
            {
                charArr[charIndex] = true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("AYUSH" + "is Unique:"+isUnique("AYUSH"));
        System.out.println("AYUSH" + "is Unique:"+isUnique("AYUSHA"));
    }
}
