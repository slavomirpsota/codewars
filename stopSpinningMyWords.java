/*
Description:
Write a function that takes in a string of one or more words, and returns the same string, 
but with all five or more letter words reversed (Just like the name of this Kata). 
Strings passed in will consist of only letters and spaces. 
Spaces will be included only when more than one word is present.

Examples: 
spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" 
spinWords( "This is a test") => returns "This is a test" 
spinWords( "This is another test" )=> returns "This is rehtona test"
*/

import java.util.*;

public class SpinWords {
	//SOLUTION 1//
  /*public String spinWords(String sentence) {
  List<String> myList = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
  String finalString = "";
  StringBuilder sb = new StringBuilder();
  
  for(String s : myList){
        if(s.length() < 5){
        finalString += s + " ";
        sb.delete(0, sb.length());
        }else {
        finalString += sb.append(s).reverse().toString() + " ";
        sb.delete(0, sb.length());
        }
    }
    
  return finalString.trim();*/
  
	//SOLUTION 2//
	for (String a : sentence.split(" ")){
		if (a.length() > 4){
              sentence = sentence.replace(a, new  StringBuffer(a).reverse());
        }    
       }
       return sentence;
  }
}