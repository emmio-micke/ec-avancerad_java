package palindrome;

import static javax.swing.JOptionPane.*;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int i, j;
        for (i=0, j=s.length()-1; i < j; i++, j--)
          if (s.charAt(i) != s.charAt(j))
            return false;
        return true;
      } 
    
      public static void main(String[] arg) {
        String word = showInputDialog("Skriv ett ord");
        if (isPalindrome(word))
          showMessageDialog(null, "Ordet är ett palindrom");
        else
          showMessageDialog(null, "Ordet är inte ett palindrom"); 
        System.exit(0);     
      }
    
}