package test;

public class test2 {
	public static void main(String[] args) {
		
		
		String str1="abcopqrst";
		String str2="trsedepopqrst";
		String small="";
		String longer="";
		String longestCommon="";
		int maxLength=0;
		
		if (str1.length()<str2.length())
{
	 small=str1;
	 longer=str2;
	 
}
		else {
			small=str2;
			longer=str1;
		}
		
		
		for (int i=0;i<small.length();i++)
		{
			small=small.substring(i, small.length());
			
			for (int j=0;j<small.length();j++)
			{
				if (isSubstringPresent(small,longer)) {
				
				maxLength=Math.max(maxLength, small.length());
				longestCommon=small;
				
				}
				
				}
			
			
		}
		
		System.out.println(longestCommon+maxLength);
		
	}

	public static boolean isSubstringPresent(String chotu, String lambu)
	{
		boolean subIsPresent=false;
		if (lambu.contains(chotu))
		{
			subIsPresent=true;
		}
		return subIsPresent;
		
	}
}
