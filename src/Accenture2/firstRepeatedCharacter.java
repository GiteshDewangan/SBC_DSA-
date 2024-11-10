package Accenture2;

import java.util.*;

public class firstRepeatedCharacter {
    public static char repeatedCharacter( String s ){
        HashMap<Character,Integer> freqMap = new HashMap<>();
        for( int  i= 0 ; i<s.length();i++){
            char currentChar = s.charAt(i);

            if( freqMap.containsKey( currentChar)){

                return currentChar;
            } else{
                freqMap.put(currentChar , 1);
            }
        }

        return s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println( repeatedCharacter( "abcdab"));
    }
}
