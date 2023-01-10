package jan_10;

public class NoteBook extends Product {
	private double inch;
	private String weight;
	
	public void setInch(double inch) {
		this.inch = inch;
	}
	public double getInch() {
		return this.inch;
	}
	
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWeight() {
		return this.weight;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + ", inch: " + inch + ", weight: " + weight;
	}
}
