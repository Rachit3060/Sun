package test;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length=10;
		
		int[] arr=new int[length];
		arr[0]=0;
		arr[1]=0;
		arr[2]=1;
		
		for (int i=2;i<length-1;i++)
		{
			arr[i+1]=arr[i]+arr[i-1];
		}
		
		System.out.println(arr[7]);
		
		char c='a';
		String str="abcd";
		if (str.contains(Character.toString(c)))
		{
			System.out.println("Hello");
		}
		if (str.charAt(2)==c)
		{
			
		}
		
	}

}
