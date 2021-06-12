package assignment;

import java.util.*;

public class Main {
    public static int twoStrings(String first, String second) {
        int[] charSet = new int[256];
        
        for(int i=0; i<first.length(); i++)
            charSet[first.charAt(i)]++;
        
        for(int i=0; i<second.length(); i++)
            charSet[second.charAt(i)]--;
        
        int twoStrings = 0;
        for(int i=0; i<256; i++)
        	twoStrings += Math.abs(charSet[i]);
        
        return twoStrings;
     }
  
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = t.next();
        System.out.println("Enter second string");
        String s2 = t.next();
        System.out.println(twoStrings(s1, s2));
        t.close();
    }
}