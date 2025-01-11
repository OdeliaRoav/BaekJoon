
public class LongExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i<mathScores[i].length; i++) {
			for(int j = 0; j<mathScores[i].length; j++){
			System.out.println("mathScore["+i+"]["+j+"] = "+ mathScores[i][j]);
		}
	}
		
		mathScores[1][0] = 80;
		mathScores[1][2] = 99;
		
		for(int i = 0 ; i  < mathScores.length; i++) {
			for(int j = 0; j < mathScores[i].length; j++) {
				System.out.println("mathScore["+i+"]["+j+"] = " +mathScores[i][j]);
			}
		}
	}
}
