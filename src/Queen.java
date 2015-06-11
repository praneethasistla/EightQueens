
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
	
	public boolean isConflict(Queen q){
		int qHorValue = q.getP().getHorValue();
		int qVerValue = q.getP().getVervalue();
		int thisHorValue = this.getP().getHorValue();
		int thisVerValue = this.getP().getVervalue();
		
		if ((q.getP().getHorizontal().equals(getP().getHorizontal())) ||
				(q.getP().getVertical().equals(getP().getVertical()))) 
			return true;
		else if(((qHorValue+1 == thisHorValue) && (qVerValue+1 == thisVerValue))||
					((qHorValue-1 == thisHorValue) && (qVerValue-1 == thisVerValue)) ||
					((qHorValue+1 == thisHorValue) && (qVerValue-1 == thisVerValue)) ||
					((qHorValue-1 == thisHorValue) && (qVerValue+1 == thisVerValue)))
			return true;
		
		return false;
	}

}
