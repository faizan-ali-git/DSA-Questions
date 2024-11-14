package com.example.test;
public class GfG {
  
    // As the input string can only have lowercase 
    // characters, the maximum characters will be 26
    static final int MAX_CHAR = 26;

    static char nonRepeatingChar(String s) {
  
        // Initialize frequency array
        int[] freq = new int[MAX_CHAR];

        // Count the frequency of all characters
        for (char c : s.toCharArray()) 
            freq[c - 'a']++;

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); ++i) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return s.charAt(i);
        }
    
        // If no character with a frequency of 1 is 
        // found, then return '$'
        return '$';
    }

    public static void main(String[] args) {
        String s = "gezgeap";
  
        System.out.println(nonRepeatingChar(s));
    }
}