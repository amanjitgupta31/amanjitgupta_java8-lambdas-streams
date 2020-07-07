
import java.io.BufferedReader;
import java.io.InputStreamReader;
	
public class Avg {

	public static class CalAvg extends Thread
	{
		String data[];
		CalAvg(String x[])
		{
			this.data=x;
		}
		public void run()
		{
			int i=0,sum=0;
			int len=data.length;
			for(i=0;i<len;i++)
			{
				sum=sum+Integer.parseInt(data[i]);
			}
			float avg=(float)sum/(float)len;
			System.out.println(avg);
		}
	}
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inp[]=br.readLine().split(",");
			Thread t1=new CalAvg(inp);
			t1.start();	

		}

	}



