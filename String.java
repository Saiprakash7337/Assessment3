package dxc;

public class StringAssessment {
	
	static String moveSpecialCharacters(String s)
	{
		String s1="",s2="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if (c>64 && c<=90 || c>96 && c<=122)
			{
				s1=s1+c;
			}
			else
			{
				s2=s2+c;
			}
		}
		return s1+s2;
	}

	public static void main(String[] args) {
		
		String str1 = "He@#$llo!*&";
		String str2="%$Wel*&come!";
		 System.out.println(moveSpecialCharacters(str1));
		 System.out.println(moveSpecialCharacters(str2));

		

	}