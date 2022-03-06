import java.util.Scanner;

/*1.) Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”. 
2.) WAP to tOGGLE each word in the String? 
Input: This is Geekster 
Output: tHIS iS gEEKSTER 
3.) WAP to reverse tOGGLE each word in the String?
Input: my name is khan 
Output: yM eMAN sI nAHK */


//1.) Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”. 
class replacesubstrring{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str="A batman with bat";
        
        String result=str.replace("bat", "snow");

        System.out.println(result);
        s.close();
    }
}

//2.) WAP to tOGGLE each word in the String? 

class tOGGLE{
    public static void main(String[] args) {
        String message = "This is Geekster";
        message=message.toUpperCase();
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++) {
          if(Character.isLetter(charArray[i])) {
            if(foundSpace) {
              charArray[i] = Character.toLowerCase(charArray[i]);
              foundSpace = false;
            }
          }
          else { 
            foundSpace = true;
          }
        }
        message = String.valueOf(charArray);
        System.out.println( message);

    }
}

//  3.) WAP to reverse tOGGLE each word in the String?

class reverseEachword1{
    public static void main(String[] args) {
        String s=reverseEachWord("my name is khan").toUpperCase();

        char[] charArray = s.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++) {
          if(Character.isLetter(charArray[i])) {
            if(foundSpace) {
              charArray[i] = Character.toLowerCase(charArray[i]);
              foundSpace = false;
            }
          }
          else { 
            foundSpace = true;
          }
        }
        s = String.valueOf(charArray);
        System.out.println(s);
       
    }
    private static String reverseEachWord(String originalStr) {
        
        String[] words = originalStr.split(" ");
        StringBuilder reverseStr = new StringBuilder();
       
        for (String word : words) {
         
         StringBuilder temp = new StringBuilder(word);
         reverseStr.append(temp.reverse());
         reverseStr.append(" ");
        }

        return reverseStr.toString();
       }
}



class Main {
    public static void main(String[] args) {
  
  
      String message = "This is Geekster";
      message=message.toUpperCase();
      char[] charArray = message.toCharArray();
      boolean foundSpace = true;
  
      for(int i = 0; i < charArray.length; i++) {
        if(Character.isLetter(charArray[i])) {
          if(foundSpace) {
            charArray[i] = Character.toLowerCase(charArray[i]);
            foundSpace = false;
          }
        }
        else { 
          foundSpace = true;
        }
      }
      message = String.valueOf(charArray);
      System.out.println( message);
    }
  }