package jan_7;

public class SmartPhone extends Product{
	private String os;
	
	public void setOs(String os) {
		this.os = os;
	}
	public String getOs() {
		return this.os;
	}
	@Override
	public String getDetails() {
		return super.getDetails() + " Os: " + os;
	}
}
