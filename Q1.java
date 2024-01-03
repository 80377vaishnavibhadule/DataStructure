package assignment;

public class Q1 {

	public static boolean palindrome(String s)
	{
		int left=0;
		int right=s.length()-1;
		
		while(left < right)
		{
			if(s.charAt(left)!=s.charAt(right))
			{
				return false;
			}
			left ++;
			right--;
			
		}
		return true;
	}
	public static void main(String[] args)
	{
		
		String input ="tejaswini";
		boolean result=palindrome(input);
		
		if(result)
		{
			System.out.println(input+ " is palindrome");
		}
		else
		{
			System.out.println(input+" is not palindrome");
		}
	}
			
	
}
