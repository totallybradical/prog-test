import java.util.Arrays;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// Try with sample piece
		int[][] samplePiece = new int[2][3];
		samplePiece[0][0] = 1;
		samplePiece[0][1] = 1;
		samplePiece[0][2] = 1;
		samplePiece[1][0] = 1;
		samplePiece[1][1] = 0;
		samplePiece[1][2] = 0;
		
		FreePolyomino testPiece = new FreePolyomino(samplePiece);
		List<FixedPolyomino> rotations = testPiece.getRotations();
		for (int i = 0; i < rotations.size(); i++) {
			System.out.println(Arrays.deepToString(rotations.get(i).getPolyMap()));
		}
	}

}
