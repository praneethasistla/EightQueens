
public class EightQueens {
// array to store all the queens
	 static Queen[] arrayQ = new Queen[8];

	public static void main(String[] args) {

		for (int i=0; i<8; i++){
			arrayQ[i] = new Queen(0,0); 
			//assign basic positions to each queen.
		}
		int i=0;
		int prevQueens; // to keep track of number of queens that have their positions set.
		Queen q = new Queen();;
		
			for (int j=0; j<8; j++){
				arrayQ[i].setP(i, j);
				q.setP(i, j);
				//q is the same as arrayQ[i]. Since i changes, q can be used to check conflicts.
				prevQueens = i;
				if (j != 0){ //from the second queen onwards
					for (int k=0; k<prevQueens; k++){
						//check for every queen that has been placed before the current one.
						if(!q.isConflict(arrayQ[k]) && prevQueens-k == 1 && i<7) 
							i++; //if there is no conflicts with ANY queens places before, go to the next one.
						else if (q.isConflict(arrayQ[k])) // if there is conflict with any one of the queens, change position.
							break;
					}
				}
				else i++; //if the first queen is places, go to the second queen.
				if (i<7 && (j==6 || j==7)) // once we reach the end of a column, start again from the beginning.
					j=0;
			}

		for (int l=0; l<8; l++){
			arrayQ[l].printQueen();
		}

	}
	
	

}
