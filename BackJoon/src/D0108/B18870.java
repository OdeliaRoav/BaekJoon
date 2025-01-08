package D0108;

import java.util.*;

public class B18870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int Array[] = new int[a];
		int Array2[] = new int[a];
		
		
		for(int i = 0; i < a; i++) {
			Array[i] = Array2[i] = sc.nextInt();
		}
		
		Arrays.sort(Array);
		
		
		TreeSet<Integer> uniqueSet = new TreeSet<>();
		for(int num : Array2) {
			uniqueSet.add(num);
		}
		
		
		Map<Integer, Integer> indexMap = new HashMap<>();
		int index = 0;
		for(int v : uniqueSet) {
			if(!indexMap.containsKey(v)) {
				indexMap.put(v, index);
				index++;
			}
			
			//indexMap.put(num, index++);
		}

		
		StringBuilder sb = new StringBuilder();
		for(int key : Array2){
			int ranking = indexMap.get(key);
			sb.append(ranking).append(' ');
			
			
			//Array2[i] = indexMap.get(Array2[i]);
		}
		
		System.out.println(sb);

		
		
	}

}



// 시간 초과하는 풀이.. 쉬발 HashMap그딴거 모르는데 도움 HashMap 쓰는 방법 알고 맞았는데 시간 초과
// 이건 어케알까 쉬발
/*
 		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int Array[] = new int[a];
		int Array2[] = new int[a];
		
		
		for(int i = 0; i < a; i++) {
			Array[i] = Array2[i] = sc.nextInt();
		}
		
		Arrays.sort(Array);
		
		
		TreeSet<Integer> uniqueSet = new TreeSet<>();
		for(int num : Array2) {
			uniqueSet.add(num);
		}
		
		
		Map<Integer, Integer> indexMap = new HashMap<>();
		int index = 0;
		for(int num : uniqueSet) {
			indexMap.put(num, index++);
		}

		for(int i = 0; i< Array2.length; i++) {
			Array2[i] = indexMap.get(Array2[i]);
		}
		
		for(int i = 0; i < a; i++) {
			System.out.print(Array2[i] + " ");		
		}
*/
