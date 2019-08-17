/*
Description:
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
Rules for a smiling face:
-Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
-A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
-Every smiling face must have a smiling mouth that should be marked with either ) or D.
No additional characters are allowed except for those mentioned.
Valid smiley face examples:
:) :D ;-D :~)
Invalid smiley faces:
;( :> :} :] 
*/





import java.util.*;

public class SmileFaces {
 
  public static int countSmileys(List<String> arr) {
		//SOLUTION 1//
  
      /*
	  int counter = 0;
      List<String> smileys = Arrays.asList(":)",";)",":-)",";-)",";~)",":~)",":D",";D",":-D",":~D",";-D",";~D");
      if(arr.isEmpty()){
        return 0;
      } else{
        for(String str : arr){
          for(String smiley : smileys){
            if (str.contains(smiley)) counter++;
          }
          }
        }
      return counter;
	}
}
  */
      
		//SOLUTION 2//
	  
	  /*
      int counter = 0;
      if(arr.isEmpty()) {
        return 0;
        } else{
          for(String str : arr){
            if(str.length() == 2){
            if ((str.charAt(0) == ':' || str.charAt(0) == ';')&&(str.charAt(1) == 'D' || str.charAt(1) == ')')) {
                counter++;
              }
            }if(str.length() == 3){
              if ((str.charAt(0) == ':' || str.charAt(0) == ';')&&(str.charAt(1) == '-' || str.charAt(1) == '~')&&(str.charAt(2) == 'D' || str.charAt(2) == ')')) {
                counter++;
                }
            }
          }
        }
      
      return counter;
  }
}
*/

		//SOLUTION 3//
	  String smileys =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";
      int counter = 0;      
      for (int i =0; i < arr.size(); i++){
      
        if (smileys.contains(arr.get(i))){
            counter++;
        }
      }
      return counter;
  }
}