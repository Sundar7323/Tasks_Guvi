package Task_9;

public class palindrome {

	public static void main(String[] args) {
		
		String s = "racecar";
		boolean isPalindrome = true;
		
		int length =s.length();
		
		for (int i=0; i< length/2; i++) {
			
			if(s.charAt(i) !=s.charAt(length -i -1)){
				isPalindrome = false;
				break;
			}
		}
		if(isPalindrome) {
			System.out.println(s + " is a Palindrome");
		}
		else {
				System.out.println(s + " is not a Palindrome");
			}
		}
		
	}
