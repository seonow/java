package jan_10;

public class SmartPhone extends Product{
	private String os;
	private String color;
	
	public void setOs(String os) {
		this.os = os;
	}
	public String getOs() {
		return this.os;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + ", Os: " + os + ", Color: " + color;
	}
}
