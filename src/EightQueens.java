
public class EightQueens {

	public static void main(String[] args) {
		Queen q1 = new Queen("a", "8");
		Queen q2 = new Queen("a", "8");
		Queen q3 = new Queen("a", "8");
		Queen q4 = new Queen("a", "8");
		Queen q5 = new Queen("a", "8");
		Queen q6 = new Queen("a", "8");
		Queen q7 = new Queen("a", "8");
		Queen q8 = new Queen("a", "8");
	}
	
	public boolean isConflict(Queen a, Queen b){
		if (a.getP().getHorizontal().equals(b.getP().getHorizontal()) || 
				a.getP().getVertical().equals(b.getP().getVertical()))
				return true;
		return false;
	}

}
