package _01_TestMatchingBrackets;

import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
	
	
    public static boolean doBracketsMatch(String b) {
    	int matching = 0;
    	Stack<Character> brackets = new Stack<>();
    	for(int i=0;i<b.length();i++) {
    		brackets.push(b.charAt(i));
    	}
    	for(char br : brackets) {
    		if(br == '}') {
    			matching++;
    		}else if(br == '{') {
    			matching--;
    		}
    		
    	}
    	if(matching == 0 && brackets.peek()== '}') {
    		return true;
    	}
        return false;
    }
}