import java.util.ArrayList;
import java.util.List;

// Orientation doesn't matter
public class FreePolyomino {
    // array of arrays for polyomino block
    // int[0][0] = bottom left
    // int[x][y] = block at x on horizontal axis and y on vertical axis
    private final int[][] polyMap;
    public FreePolyomino(int[][] polyMap) {
        this.polyMap = polyMap;
    }
    // Should return the List of fixed polyominoes for the four clockwise rotations of this free polyomino
    public List<FixedPolyomino> getRotations() {
        // need to implement
    	// [1] [1] [1] 		(0,0) (0,1) (0,2)
    	// [1] [0] [0] 		(1,0) (1,1) (1,2)
    	
    	// [1] [1] 			(0,0) (0,1)
    	// [0] [1]			(1,0) (1,1)
    	// [0] [1]			(2,0) (2,1)
    	
    	// Dimensions have to be swapped
    	
    	// Create return list of FixedPoyominos
    	List<FixedPolyomino> rotations = new ArrayList<>();
    	
    	// Add initial rotation to list
    	int[][] currentPolyMap = polyMap; // Start with initial
    	rotations.add(new FixedPolyomino(currentPolyMap));
    	
    	// Perform 3 90-degree turns to cover the other options
    	for (int threeTurns = 0; threeTurns < 3; threeTurns++) {
    		// Get the rotated90PolyMap
    		int [][] rotated90PolyMap = rotated90PolyMap(currentPolyMap);
    		// Add rotated90PolyMap to list of FixedPolyominos
    		rotations.add(new FixedPolyomino(rotated90PolyMap));
    		// Set the currentPolyMap to the current rotation
    		currentPolyMap = rotated90PolyMap;
    	}
    	
        return rotations;
    }
     
    // Takes a PolyMap, and returns it rotated 90 degrees
    public int[][] rotated90PolyMap (int[][] currentPolyMap) {
    	int currentXDimension = currentPolyMap.length;
    	int currentYDimension = currentPolyMap[0].length;
    	int newXDimension = currentYDimension;
    	int newYDimension = currentXDimension;
    	int[][] rotated90PolyMap = new int[newXDimension][newYDimension];
    	for (int i = 0; i < currentXDimension; i++) {
    		for (int j = 0; j < currentYDimension; j++) {
    			rotated90PolyMap[j][i] = currentPolyMap[i][j];
    		}
    	}
		return rotated90PolyMap;
    	
    }
}