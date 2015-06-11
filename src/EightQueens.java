
public class EightQueens {

	public static void main(String[] args) {
		Queen q1 = new Queen();
		Queen q2 = new Queen();
		Queen q3 = new Queen();
/*		Queen q4 = new Queen();
		Queen q5 = new Queen();
		Queen q6 = new Queen();
		Queen q7 = new Queen();
		Queen q8 = new Queen();
	*/	
		q1.setP(0, 0);
		for (int i=0; i<8; i++){
			//place the queen in a position
			//place another queen so there's no conflict.etc.
			if (q2.getState())
				if (q3.getState())
					break;
			
			for (int j=0; j<8; j++){
				if (!q2.getState())
					q2.setP(i, j);
				if(!q2.isConflict(q1)){
					q2.setState(true);
					q3.setP(i,j);
					if(!q3.isConflict(q1) && !q3.isConflict(q2)){
						q3.setState(true);
						break;
					}
				}
			}
		}
		System.out.println("q1 position: " + q1.getP().getHorizontal() + q1.getP().getVertical());
		System.out.println("q2 position: " + q2.getP().getHorizontal() + q2.getP().getVertical());
		System.out.println("q3 position: " + q3.getP().getHorizontal() + q3.getP().getVertical());
	}
	
	

}
