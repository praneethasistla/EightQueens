
public class EightQueens {

	public static void main(String[] args) {
		Queen q1 = new Queen();
		Queen q2 = new Queen();
		Queen q3 = new Queen();
		Queen q4 = new Queen();
		Queen q5 = new Queen();
		Queen q6 = new Queen();
/*		Queen q7 = new Queen();
		Queen q8 = new Queen();
	*/	
		q1.setP(0, 0);
		for (int i=0; i<8; i++){
			//place the queen in a position
			//place another queen so there's no conflict.etc.
			if (q2.getState())
				if (q3.getState())
					if(q4.getState())
						if(q5.getState())
							break;
			
			for (int j=0; j<8; j++){
				if (!q2.getState())
					q2.setP(i, j);
				if (!q3.getState())
					q3.setP(i, j);
				if (!q4.getState())
					q4.setP(i, j);
				if (!q5.getState())
					q5.setP(i, j);
				
				if(!q2.isConflict(q1)){
					if (!q2.getState()){
						q2.setState(true);
						i = 2;
					}
					if(!q3.isConflict(q1) && !q3.isConflict(q2)){
						if (!q3.getState()){
							q3.setState(true);
							i = 3;
						}
						if(!q4.isConflict(q1) && !q4.isConflict(q2) && !q4.isConflict(q3)){
							if (!q4.getState()){
								q4.setState(true);
								i = 4;
								j = 0;
							}
							if(!q5.isConflict(q1) && !q5.isConflict(q2) && !q5.isConflict(q3) && !q5.isConflict(q4)){
								if (!q5.getState()){
									q5.setState(true);
									i = 5;
									j = 0;
								}
								q6.setP(i, j);
								if(!q6.isConflict(q1) && !q6.isConflict(q2) && !q6.isConflict(q3) && !q6.isConflict(q4) &&
										!q6.isConflict(q5)){
									if (!q6.getState()){
										q6.setState(true);
										i = 6;
										j = 0;
									}
									q6.setState(true);
									break;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("q1 position: " + q1.getP().getHorizontal() + q1.getP().getVertical());
		System.out.println("q2 position: " + q2.getP().getHorizontal() + q2.getP().getVertical());
		System.out.println("q3 position: " + q3.getP().getHorizontal() + q3.getP().getVertical());
		System.out.println("q4 position: " + q4.getP().getHorizontal() + q4.getP().getVertical());
		System.out.println("q5 position: " + q5.getP().getHorizontal() + q5.getP().getVertical());
		System.out.println("q6 position: " + q6.getP().getHorizontal() + q6.getP().getVertical());
	}
	
	

}
