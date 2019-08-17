/*
Description:
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, 
the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at 
least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. 
Ignore numbers and punctuation.

*/

import java.util.*;

public class PangramChecker {
	//SOLUTION 1//
  /*public boolean check(String sentence){
    List<Character> charList = new ArrayList<Character>();
  
    for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
      charList.add(c);
    }
    
    String str = sentence.toLowerCase();
    int index;
    
    for(int i = 0; i<str.length();i++){
      if(charList.contains(str.charAt(i))){
        index = charList.indexOf(str.charAt(i));
        charList.remove(index);
      }
    }
    if(charList.isEmpty()) return true;
    else return false;
  }
}*/

	//SOLUTION 2//
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    
    List<String> sentenceChars = Arrays.asList( sentence.toLowerCase().split("") );
    List<String> charList = Arrays.asList( alphabet.split("") );
    
    return sentenceChars.containsAll( charList ); 
  }