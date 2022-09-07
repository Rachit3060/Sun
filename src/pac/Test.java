package pac;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int needle=2;
		int hay=2342282;
		
		
		
		
		int result=countoccurrences(hay,needle);
		System.out.println(result);
	}
	
	static int countoccurrences(int n,
            int d)
{
int count = 0;

// Loop to find the digits of N
while (n > 0)
{

// check if the digit is D
count = (n % 10 == d) ?
    count + 1 : count;
n = n / 10;
}

// return the count of the
// occurrences of D in N
return count;
}

}
