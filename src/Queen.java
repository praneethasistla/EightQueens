
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
		if ((q.getP().getHorizontal().equals(getP().getHorizontal())) ||
				(q.getP().getVertical().equals(getP().getVertical())))
				return true;
		return false;
	}

}
