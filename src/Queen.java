public class Queen {
	private boolean state;
	private Position p = new Position();
	
	public Queen() {
	}
	
	public Queen(int h, int v){
		setP(h, v);
	}
	
	public Queen(boolean isalive, int h, int v){
		setP(h, v);
		state = isalive;
	}
	
	public boolean getState(){
		return state;
	}
	
	public void setState(Boolean state1){
		state = state1;
	}
	
	public void setP(int h, int v) {
		p.setPosition(h, v);
	}

	public Position getP() {
		return p;
	}
	
	public void printQueen(){
		System.out.println("q1 position: " + getP().getHorizontal() + getP().getVertical());
	}

	public boolean isConflict(Queen q){
		int qHorValue = q.getP().getHorValue();
		int qVerValue = q.getP().getVervalue();
		int thisHorValue = this.getP().getHorValue();
		int thisVerValue = this.getP().getVervalue();
		boolean conflict = false;
		
		if ((q.getP().getHorizontal().equals(this.getP().getHorizontal())) ||
				(q.getP().getVertical().equals(this.getP().getVertical()))) 
			conflict = true;
		for (int i=0; i<7; i++){
			if(((qHorValue+i == thisHorValue) && (qVerValue+i == thisVerValue))||
						((qHorValue-i == thisHorValue) && (qVerValue-i == thisVerValue)) ||
						((qHorValue+i == thisHorValue) && (qVerValue-i == thisVerValue)) ||
						((qHorValue-i == thisHorValue) && (qVerValue+i == thisVerValue)))
				conflict = true;
		}
		return conflict;
	}

}
