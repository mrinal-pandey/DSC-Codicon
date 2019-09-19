import java.util.*;
import java.io.*;

class SystemCommand
{
	public static void main(String[] args)
	{
		String s = null;
		System.out.println("Codicon is fun!");
		Scanner in=new Scanner(System.in);
		try
		{
			Process p=Runtime.getRuntime().exec("java SystemCommand");
			BufferedReader input=new BufferedReader(new InputStreamReader(p.getInputStream()));
			while((s=input.readLine())!=null)
			{
				System.out.println(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
