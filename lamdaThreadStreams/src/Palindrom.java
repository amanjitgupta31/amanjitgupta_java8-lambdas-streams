


import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Palindrom 
{
	static ArrayList<String> str2=new ArrayList<>();
	
	public static void rev(String st)
	{
		String temp="";
		int len=st.length();
		for(int i=len-1;i>=0;i--)
		{
			temp=temp+st.charAt(i);
		}
		str2.add(temp);
	}
	
	public static List<String> chk(List<String> str1,Predicate<String> predicate)
	{
		return str1.stream().filter(predicate::test).collect(Collectors.toList());
	}
	
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inp[]=br.readLine().split(",");
		List<String> str1=Arrays.asList(inp);
		
		str1.forEach(Palindrom::rev);
		
		List output=(chk(str1,x -> str2.contains(x)));
		
		output.forEach(System.out::println);
		
	}

}
