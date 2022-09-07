package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Input : str1 = "zxabcdezy",
//                 str2 = "yzabcdezx"
//     Output : abcdez
		
		String str="Manish is a boy and Bob is a boy";
		
		String temp[]=str.split(" ");
		int count=0;
		int len=temp.length;
		
		for (int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				
				if(temp[i].equalsIgnoreCase(temp[j]))
				{
					 
					count=count+1;
					
				}
				
			}
			System.out.println(temp[i]+" is occurring "+count+ " times" );
		}

	}
}
