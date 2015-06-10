
public class Position {
	private String horizontal;
	private String vertical;
	public Position(){
		horizontal = "a";
		vertical = "8";
	}
	
	public Position (int h, int v){
		BoxValue(h, v);
	}
	
	public String getHorizontal(){
		return horizontal;
	}
	
	public String getVertical(){
		return vertical;
	}
	
	public void setPosition(int h, int v) {
		BoxValue(h, v);
	}
	
	public void BoxValue(int h, int v){
		v++;
		vertical = "" + v;
		switch(h){
		case 0:
			horizontal = "a";
			break;
		case 1:
			horizontal = "b";
			break;
		case 2:
			horizontal = "c";
			break;
		case 3:
			horizontal = "d";
			break;
		case 4:
			horizontal = "e";
			break;
		case 5:
			horizontal = "f";
			break;
		case 6:
			horizontal = "g";
			break;
		case 7:
			horizontal = "h";
			break;
		}
	}
}
