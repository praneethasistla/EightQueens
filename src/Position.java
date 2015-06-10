
public class Position {
	private String horizontal;
	private String vertical;
	public Position(){
		horizontal = "a";
		vertical = "8";
	}
	
	public Position (String h, String v){
		horizontal = h;
		vertical = v;
	}
	
	public String getPosition(){
		return horizontal + vertical;
	}
}
