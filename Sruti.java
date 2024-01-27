import java.lang.System;
import java.lang.String;
import java.io.*;
class Sruti
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		//nmae
		System.out.println("Enter your name:");
		String name = br.readLine();
		//branch
		System.out.println("Enter your Branch:");
		String branch = br.readLine();
		//cname
		System.out.println("Enter your College NAME:");
		String cname = br.readLine();
		System.out.println("Enter your Roll no.:");
		int rn = Integer.parseInt(br.readLine());
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch);
		System.out.println("Roll no.:"+rn);
		System.out.println("College Name:"+cname);
	}
}