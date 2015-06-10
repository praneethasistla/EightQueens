
public class Queen {
	private boolean state;
	private Position p;
	
	public Queen() {
	}
	
	public Queen(String h, String v){
		setP(new Position(h, v));
	}
	
	public Queen(boolean isalive, String h, String v){
		setP(new Position(h, v));
		state = isalive;
	}
	
	public boolean getState(){
		return state;
	}

	public void setP(Position p1) {
		p = p1;
	}

	public Position getP() {
		return p;
	}

}
