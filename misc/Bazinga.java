/**
 * D2C question
 * Check if a word have BAZINGA in it.
 * example: BBAAZHJHIINNFJDSGGGAAA has BAZINGA in it
 * 'B' B 'A' A 'Z' HJH 'I' I 'N' NFJDS 'G' GG 'A' AA
 * AAZZIIINNGGGAAABBBB doesn't have BAZINGA in it.
*/

import java.util.*;
public class Bazinga{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=0; i<n; i++)
    {
      int len = in.nextInt();
      String s = in.next();
      if(hasIt(s))
      System.out.println("YES");
      else
      System.out.println("NO");     
    }
    in.close();
  }
  public static boolean hasIt(String s){
    char baz[] = {'B','A','Z','I','N','G','A'};
    int last=-1;
      for(char ch : baz){
        last = s.indexOf(ch, last);
        if(last==-1)
        return false;
      }
    return true;
  }
}