package D0108;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10798 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		char charArr[][] = new char[5][15];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<5; i++)
		{
			String st = br.readLine();
			for(int j=0; j<st.length(); j++)
			{
				charArr[i][j] = st.charAt(j);		
			}			
		}
		
		for(int i=0; i < 15; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(charArr[j][i] != 0) //char 형에서는 0이 null 값을 대신한다.
				{
					sb.append(charArr[j][i]);
				}
			}
		}
		System.out.print(sb);
	}
}