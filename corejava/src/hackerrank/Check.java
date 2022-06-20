package hackerrank;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels = 0;
		int consonant = 0;
		int whitespace = 0;
		int digits = 0;
		int schar = 0;
		
		String s1 = "Think twice #2 code once #1.";
		for(int i=0; i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(Character.isLetter(ch))
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
				{
					vowels++;
				}
				else
				{
					consonant++;
				}
			}
			else if(Character.isDigit(ch))
			{
				if(ch>=48&&ch<=57)
				{
					digits++;
				}
			}
			else if(Character.isWhitespace(ch))
			{
				whitespace++;
			}
			else
			{
				schar++;
			}
		}
		System.out.println("Vowels= "+vowels);
		System.out.println("Consonants= "+consonant);
		System.out.println("Digits= "+digits);
		System.out.println("Special Characters= "+schar);
		System.out.println("Whitespace= "+whitespace);
	}

}
