// Orientation matters
public class FixedPolyomino {
    // int[0][0] = bottom left
    // int[x][y] = block at x on horizontal axis and y on vertical axis
    private final int[][] polyMap;
    public int[][] getPolyMap() {
		return polyMap;
	}
	public FixedPolyomino(int[][] polyMap) {
        this.polyMap = polyMap;
    }
    // Does this polyomino fit cleanly onto the gamemap if dropped directly down
    // with x offset?
    public boolean fitsOnto(int[][] gameMap, int xOffset) {
        // need to implement
        return false;
    }
}