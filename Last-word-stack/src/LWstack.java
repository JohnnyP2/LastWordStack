import java.util.*;
public class LWstack {


	class Solution {
		/*
		 * This method takes a string and splits it into multiple strings based on the spaces between words
		 * after being split it pushs the strings into a stack, the stack is then popped and the letter count is returned
		 */
	    public static int lengthOfLastWord(String s) {
	        int len =0;
	        Stack<String> lastWord = new Stack<String>();
	        String[] cut = s.trim().split("\\s+"); //trims and cuts the string into multiple words per item in the array 
	        for(int i = 0;i<cut.length;i++){ //pushing each word into the stack
	            lastWord.push(cut[i]);
	        }
	        len = lastWord.pop().length(); //because stacks are FILO all we need to do is pop it and count because the last word is always at the top of the stack
	        return len;
	    }
	    
	    public static void main(String[] args) {
	    	Scanner keyboard = new Scanner(System.in);
	    	System.out.println("Enter a sentence");
	    	String words = keyboard.nextLine();
	    	keyboard.close();
	    	System.out.println("The length of the last word is: "+ lengthOfLastWord(words));

	    }
	}
	
	
}
