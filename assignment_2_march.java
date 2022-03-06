import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a string : ");
        String str=s.nextLine();
        System.out.print("enter a number : ");
        int k=s.nextInt();
        System.out.println(truncateSentence(str,k));

    }
    private static String truncateSentence(String s, int k) {
        String[] array = s.split(" ");
        StringBuffer sb = new StringBuffer(array[0]);
        for (int i = 1; i < k; i++)
            sb.append(" " + array[i]);
        return sb.toString();
    }
}
class valid{
    static boolean isValid(String str, int n)
    {
    
        // If first character is invalid
        if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
            || (str.charAt(0)>= 'A' && str.charAt(0) <= 'Z')
            || str.charAt(0) == '_'))
            return false;
    
        // Traverse the string for the rest of the characters
        for (int i = 1; i < str.length(); i++)
        {
            if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                || (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                || str.charAt(i) == '_'))
                return false;
        }
 
    // String is a valid identifier
    return true;
    }
 
    // Driver code
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        String str =s.nextLine();
        int n = str.length();
    
        if (isValid(str, n))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}