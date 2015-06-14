
public class Position {
	private String horizontal;
	private String vertical;
	private int horValue;
	private int verValue;
	
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
	
	public int getHorValue(){
		 BoxValueInt();
		 return horValue;
	}
	
	public int getVervalue(){
		BoxValueInt();
		return verValue;
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
	
	public void BoxValueInt(){
		if (horizontal.equals("a"))
			horValue = 0;
		else if (horizontal.equals("b"))
			horValue = 1;
		else if (horizontal.equals("c"))
			horValue = 2;
		else if (horizontal.equals("d"))
			horValue = 3;
		else if (horizontal.equals("e"))
			horValue = 4;
		else if (horizontal.equals("f"))
			horValue = 5;
		else if (horizontal.equals("g"))
			horValue = 6;
		else if (horizontal.equals("h"))
			horValue = 7;
		
		verValue = Integer.parseInt(vertical)-1;
	}
	
}
