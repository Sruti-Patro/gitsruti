import java.lang.*;
import java.io.*;
class P3
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a float type number:");
		float a = Float.parseFloat(br.readLine());
		System.out.println("Enter a float type number:");
		float b = Float.parseFloat(br.readLine());
		float c;
		c=a+b;
		System.out.println("Sum = "+c);
	}
}