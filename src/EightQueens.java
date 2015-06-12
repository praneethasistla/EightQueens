
public class EightQueens {

	public Queen[] arrayQ = new Queen[];

	public static void main(String[] args) {

		for (int i=0; i<8; i++){
			Queen[i] = new Queen();
		}
/*
		Queen q1 = new Queen();
		Queen q2 = new Queen();
		Queen q3 = new Queen();
		Queen q4 = new Queen();
		Queen q5 = new Queen();
		Queen q6 = new Queen();
		Queen q7 = new Queen();
		Queen q8 = new Queen();
*/
		Queen[0].setP(0, 0);
		for (int k=0; k<8; k++){
			if (Queen[1].getState() && Queen[2].getState() && Queen[3].getState() &&
				Queen[4].getState() && Queen[5].getState() && Queen[6].getState())
				break;

		}

//		q1.setP(0, 0);
		for (int i=0; i<8; i++){
			//place the queen in a position
			//place another queen so there's no conflict.etc.
/*
			if (q2.getState())
				if (q3.getState())
					if(q4.getState())
						if(q5.getState())
							if(q6.getState())
								if(q7.getState())
							break;
*/

			for (int j=0; j<8; j++){
				if (!q2.getState())
					q2.setP(i, j);
				if (!q3.getState())
					q3.setP(i, j);
				if (!q4.getState())
					q4.setP(i, j);
				if (!q5.getState())
					q5.setP(i, j);
				if (!q6.getState())
					q6.setP(i, j);
				if (!q7.getState())
					q7.setP(i, j);
				
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
								if(!q6.isConflict(q1) && !q6.isConflict(q2) && !q6.isConflict(q3) && !q6.isConflict(q4) &&
										!q6.isConflict(q5)){
									if (!q6.getState()){
										q6.setState(true);
										i = 6;
										j = 0;
									}
									//q7.setP(i, j);
									if(!q7.isConflict(q1) && !q7.isConflict(q2) && !q7.isConflict(q3) && !q7.isConflict(q4) &&
											!q7.isConflict(q5) && !q7.isConflict(q6)){
										if (!q7.getState()){
											q7.setState(true);
											i = 7;
											j = 0;
										}
										q8.setP(i, j);
										if(!q8.isConflict(q1) && !q8.isConflict(q2) && !q8.isConflict(q3) && !q8.isConflict(q4) &&
												!q8.isConflict(q5) && !q8.isConflict(q6) && !q8.isConflict(q7)){
											q8.setState(true);
											break;
										}
									}
								}
							}
						}
					}
				}
			}
		}

		for (int i=0; i<8; i++){
			Queen[i].printQueen();
		}
/*		
		System.out.println("q1 position: " + q1.getP().getHorizontal() + q1.getP().getVertical());
		System.out.println("q2 position: " + q2.getP().getHorizontal() + q2.getP().getVertical());
		System.out.println("q3 position: " + q3.getP().getHorizontal() + q3.getP().getVertical());
		System.out.println("q4 position: " + q4.getP().getHorizontal() + q4.getP().getVertical());
		System.out.println("q5 position: " + q5.getP().getHorizontal() + q5.getP().getVertical());
		System.out.println("q6 position: " + q6.getP().getHorizontal() + q6.getP().getVertical());
		System.out.println("q7 position: " + q7.getP().getHorizontal() + q7.getP().getVertical());
		System.out.println("q8 position: " + q8.getP().getHorizontal() + q8.getP().getVertical());
*/

	}
	
	

}
