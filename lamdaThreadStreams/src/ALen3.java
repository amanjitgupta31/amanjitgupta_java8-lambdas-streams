

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ALen3 {

	public static void main(String[] args) throws Exception 
	{
		List<String> input=new ArrayList();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String data[]=br.readLine().split(",");
		for(String s:data)
			input.add(s);
		
		List output=input.stream()
				.filter(str->str.length()==3)
				.filter(st->st.charAt(0)=='a')
				.collect(Collectors.toList());
		System.out.println(output);
	}

}



