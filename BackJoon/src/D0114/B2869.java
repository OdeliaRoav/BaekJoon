package D0114;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2869 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        int tmp1 = v - a;
        int tmp2 = a - b;
        
        int day;
        
        day = (tmp1) / (tmp2) + 1;
        
        if ((tmp1) % (tmp2) != 0) day++;
        

        System.out.print(day);
        
        bw.flush(); // BufferedWriter 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
    }
}

/*
int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
int c = Integer.parseInt(st.nextToken());

int meter = 0;
int day = 0;

while(true) {
	
	meter = meter + a;
	day++;
	if(meter>=c) {
		break;
	}
	meter = meter - b;
}

bw.write(day);*/
